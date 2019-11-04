package com.example.administrator.coolweather.weatherInformation;

import android.util.Log;

import com.example.administrator.coolweather.NetTask;
import com.example.administrator.coolweather.NetTaskCallback;
import com.example.administrator.coolweather.utils.ConfigUtils;
import com.example.administrator.coolweather.utils.NetUtils;
import com.example.administrator.coolweather.weatherInformation.model.HourlyWeather;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;
import com.example.administrator.coolweather.weatherInformation.model.WeatherForecast;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class GetWeatherInformationTask implements WeatherTask<String> {
    private final static String TAG = "GetWeatherInformation";
    private static GetWeatherInformationTask INSTANCE = null;
    private Retrofit retrofit;
    private Disposable disposable;
    GetWeatherInformationTask(){
        createRetrofit();
    }

    public static GetWeatherInformationTask getInstance(){
        if (INSTANCE == null){
            INSTANCE = new GetWeatherInformationTask();
        }
        return INSTANCE;
    }
    private void createRetrofit(){
        retrofit = NetUtils.getInstance().getRetrofitInstance(ConfigUtils.WEATHER);
    }
    @Override
    public Disposable execute(String data, final GetWeatherCallback callback) {
        GetNowWeatherService nowWeatherService = retrofit.create(GetNowWeatherService.class);
        final Observable<NowWeather> nowWeather = nowWeatherService.getWeatherInformation(data,ConfigUtils.KEY_ID);
        nowWeather.subscribeOn(Schedulers.io())
                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribe(new Observer<NowWeather>() {
                      @Override
                      public void onSubscribe(Disposable d) {
                          disposable = d;
                      }

                      @Override
                      public void onNext(NowWeather nowWeatherInfo) {
                          Log.d(TAG,"onNext");
                          callback.getNowWeatherSuccess(nowWeatherInfo);

                      }

                      @Override
                      public void onError(Throwable e) {
                          Log.d(TAG,"onError");

                      }

                      @Override
                      public void onComplete() {

                      }
                  });
        GetDailyForecastService dailyForecastService = retrofit.create(GetDailyForecastService.class);
        Observable<WeatherForecast> weatherForecast = dailyForecastService.getDailyForecastInfo(data,ConfigUtils.KEY_ID);
        weatherForecast.subscribeOn(Schedulers.io())
                       .observeOn(AndroidSchedulers.mainThread())
                       .subscribe(new Observer<WeatherForecast>() {
                           @Override
                           public void onSubscribe(Disposable d) {

                           }

                           @Override
                           public void onNext(WeatherForecast weatherForecast) {
                                Log.d(TAG,weatherForecast.getHeWeather6().get(0).getStatus());
                                callback.getWeatherForecastSuccess(weatherForecast);
                           }

                           @Override
                           public void onError(Throwable e) {
                                callback.onFial(e.toString());
                           }

                           @Override
                           public void onComplete() {

                           }
                       });
        GetHourlyWeatherService hourlyWeatherService = retrofit.create(GetHourlyWeatherService.class);
        Observable<HourlyWeather> observable = hourlyWeatherService.getHourlyWeather(data,ConfigUtils.KEY_ID);
        observable.subscribeOn(Schedulers.io())
                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribe(new Observer<HourlyWeather>() {
                      @Override
                      public void onSubscribe(Disposable d) {

                      }

                      @Override
                      public void onNext(HourlyWeather weather) {
                          Log.d(TAG,weather.getHeWeather6().get(0).getStatus());
                            callback.getHourlyWeatherSuccess(weather);
                      }

                      @Override
                      public void onError(Throwable e) {
                          Log.d(TAG,e.toString());
                          callback.onFial(e.toString());
                      }

                      @Override
                      public void onComplete() {

                      }
                  });
        return disposable;

    }
}
