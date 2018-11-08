package com.example.administrator.coolweather.weatherInformation.presenter;

import android.util.Log;

import com.example.administrator.coolweather.NetTaskCallback;
import com.example.administrator.coolweather.weatherInformation.GetWeatherInformationTask;
import com.example.administrator.coolweather.weatherInformation.WeatherInformationContract;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;

import java.util.List;

public class WeatherInformationPresenter implements WeatherInformationContract.Presenter,NetTaskCallback<NowWeather> {
    private final static String TAG = "presenter";
    private WeatherInformationContract.View view;
    private GetWeatherInformationTask task;
    public WeatherInformationPresenter(WeatherInformationContract.View view, GetWeatherInformationTask task){
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
    public void setNowWeatherInfo(List<NowWeather> info) {

    }

    @Override
    public void setLifeStyleInfo(List<NowWeather> info) {

    }

    @Override
    public void setDailyForcastInfo(List<NowWeather> info) {

    }


    @Override
    public void onSuccess(NowWeather nowWeather) {
        view.setNowWeatherInfo(nowWeather);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onFailed(String msg) {
        view.showError();
    }

    @Override
    public void onFinish() {

    }
}
