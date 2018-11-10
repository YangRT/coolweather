package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.weatherInformation.model.WeatherForecast;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetDailyForecastService {
    @FormUrlEncoded
    @POST("forecast?")
    Observable<WeatherForecast> getDailyForecastInfo(@Field("location")String location,@Field("key")String key);
}
