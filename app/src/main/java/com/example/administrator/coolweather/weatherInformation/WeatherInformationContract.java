package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.BaseView;
import com.example.administrator.coolweather.weatherInformation.model.DailyForecastInfo;
import com.example.administrator.coolweather.weatherInformation.model.LifeStyle;
import com.example.administrator.coolweather.weatherInformation.model.LifeStyleInfo;
import com.example.administrator.coolweather.weatherInformation.model.NowWeatherInfo;

import java.util.List;

public interface WeatherInformationContract {
    interface Presenter{
        void getWeatherInfo(String location);
        void setNowWeatherInfo(List<NowWeatherInfo> info);
        void setLifeStyleInfo(List<LifeStyleInfo> info);
        void setDailyForcastInfo(List<DailyForecastInfo> info);
    }
    interface View extends BaseView<Presenter>{
        void setLocation(String location);
        void setNowWeatherInfo(List<NowWeatherInfo> info);
        void setLifeStyleInfo(List<LifeStyleInfo> info);
        void setDailyForcastInfo(List<DailyForecastInfo> info);
        void showLoading();
        void hideLoading();
        void showError();
    }
}
