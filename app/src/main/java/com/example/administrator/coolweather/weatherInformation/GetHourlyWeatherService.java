package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.weatherInformation.model.HourlyWeather;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetHourlyWeatherService {
    @FormUrlEncoded
    @POST("hourly?")
    Observable<HourlyWeather> getHourlyWeather(@Field("location")String location,@Field("key")String key);
}
