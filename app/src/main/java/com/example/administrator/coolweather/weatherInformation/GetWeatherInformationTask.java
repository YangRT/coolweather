package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.NetTask;
import com.example.administrator.coolweather.NetTaskCallback;
import com.example.administrator.coolweather.utils.ConfigUtils;
import com.example.administrator.coolweather.utils.NetUtils;
import com.example.administrator.coolweather.weatherInformation.model.DailyForecastInfo;
import com.example.administrator.coolweather.weatherInformation.model.LifeStyleInfo;
import com.example.administrator.coolweather.weatherInformation.model.NowWeatherInfo;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.Retrofit;

public class GetWeatherInformationTask implements NetTask<String> {
    private static GetWeatherInformationTask INSTANCE = null;
    private Retrofit retrofit;

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
    public Disposable execute(String data, NetTaskCallback callback) {
        GetNowWeatherService nowWeatherService = retrofit.create(GetNowWeatherService.class);
        Observable<NowWeatherInfo> nowWeather = nowWeatherService.getWeatherInformation(data);
        GetDailyForecastService dailyForecastService = retrofit.create(GetDailyForecastService.class);
        Observable<DailyForecastInfo> dailyForecast = dailyForecastService.getDailyForecastInfo(data);
        GetLifeStyleService lifeStyleService = retrofit.create(GetLifeStyleService.class);
        Observable<LifeStyleInfo> lifeStyle = lifeStyleService.getLifeStyleInfo(data);
        return new Disposable() {
            @Override
            public void dispose() {

            }

            @Override
            public boolean isDisposed() {
                return false;
            }
        };
    }
}
