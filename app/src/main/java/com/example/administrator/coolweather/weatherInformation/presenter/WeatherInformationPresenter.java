package com.example.administrator.coolweather.weatherInformation.presenter;

import android.util.Log;

import com.example.administrator.coolweather.NetTaskCallback;
import com.example.administrator.coolweather.weatherInformation.GetWeatherCallback;
import com.example.administrator.coolweather.weatherInformation.GetWeatherInformationTask;
import com.example.administrator.coolweather.weatherInformation.WeatherInformationContract;
import com.example.administrator.coolweather.weatherInformation.WeatherTask;
import com.example.administrator.coolweather.weatherInformation.model.AirCondition;
import com.example.administrator.coolweather.weatherInformation.model.HourlyWeather;
import com.example.administrator.coolweather.weatherInformation.model.LifeStyleInformation;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;
import com.example.administrator.coolweather.weatherInformation.model.WeatherForecast;

import java.util.List;

public class WeatherInformationPresenter implements WeatherInformationContract.Presenter,GetWeatherCallback {
    private final static String TAG = "presenter";
    private WeatherInformationContract.View view;
    private WeatherTask task;
    public WeatherInformationPresenter(WeatherInformationContract.View view,WeatherTask task){
        this.view = view;
        this.task = task;
    }
    @Override
    public void subscribe() {
    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void getWeatherInfo(String location) {
        Log.d(TAG,"getInfo");
        task.execute(location,this);
    }


    @Override
    public void getNowWeatherSuccess(NowWeather info) {
        view.setNowWeatherInfo(info);
    }

    @Override
    public void getWeatherForecastSuccess(WeatherForecast info) {
        view.setDailyForecastInfo(info);
    }

    @Override
    public void getHourlyWeatherSuccess(HourlyWeather info) {
        view.setHourlyWeatherInfo(info);
    }

    @Override
    public void getLifeStyleSuccess(LifeStyleInformation info) {
        view.setLifeStyleInfo(info);
    }

    @Override
    public void getAirConditionSuccess(AirCondition info) {
        view.setAirConditionInfo(info);
    }

    @Override
    public void onFial(String which) {
        view.showError(which);
    }
}
