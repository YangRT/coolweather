package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.BasePresenter;
import com.example.administrator.coolweather.BaseView;
import com.example.administrator.coolweather.weatherInformation.model.AirCondition;
import com.example.administrator.coolweather.weatherInformation.model.LifeStyleInformation;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;
import com.example.administrator.coolweather.weatherInformation.model.WeatherForecast;

import java.util.List;

public interface WeatherInformationContract {
    interface Presenter extends BasePresenter {
        void getWeatherInfo(String location);
        void setNowWeatherInfo(NowWeather info);
        void setLifeStyleInfo(LifeStyleInformation info);
        void setDailyForecastInfo(WeatherForecast info);
        void setAirConditionInfo(AirCondition info);
    }
    interface View extends BaseView<Presenter>{
        void setLocation(String location);
        void setNowWeatherInfo(NowWeather info);
        void setLifeStyleInfo(LifeStyleInformation info);
        void setDailyForecastInfo(WeatherForecast info);
        void setAirConditionInfo(AirCondition info);
        void showLoading();
        void hideLoading();
        void showError(String error);
    }
}
