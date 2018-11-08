package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.BasePresenter;
import com.example.administrator.coolweather.BaseView;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;

import java.util.List;

public interface WeatherInformationContract {
    interface Presenter extends BasePresenter {
        void getWeatherInfo(String location);
        void setNowWeatherInfo(List<NowWeather> info);
        void setLifeStyleInfo(List<NowWeather> info);
        void setDailyForcastInfo(List<NowWeather> info);
    }
    interface View extends BaseView<Presenter>{
        void setLocation(String location);
        void setNowWeatherInfo(NowWeather info);
        void setLifeStyleInfo(List<NowWeather> info);
        void setDailyForcastInfo(List<NowWeather> info);
        void showLoading();
        void hideLoading();
        void showError();
    }
}
