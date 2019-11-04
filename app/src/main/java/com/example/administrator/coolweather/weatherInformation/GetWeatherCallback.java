package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.weatherInformation.model.AirCondition;
import com.example.administrator.coolweather.weatherInformation.model.HourlyWeather;
import com.example.administrator.coolweather.weatherInformation.model.LifeStyleInformation;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;
import com.example.administrator.coolweather.weatherInformation.model.WeatherForecast;

public interface GetWeatherCallback {
    void getNowWeatherSuccess(NowWeather nowWeather);
    void getWeatherForecastSuccess(WeatherForecast info);
    void getHourlyWeatherSuccess(HourlyWeather info);
    void getLifeStyleSuccess(LifeStyleInformation info);
    void getAirConditionSuccess(AirCondition info);
    void onFial(String which);
}
