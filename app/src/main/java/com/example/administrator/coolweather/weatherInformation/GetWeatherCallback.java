package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.weatherInformation.model.NowWeather;

public interface GetWeatherCallback {
    void getNowWeatherSuccess(NowWeather nowWeather);
    void getWeatherForecasrSuccess();
    void getHourlyWeatherSuccess();
    void getLifeStyleSuccess();
    void getAirCoditionSuccess();
    void onFial(String which);
}
