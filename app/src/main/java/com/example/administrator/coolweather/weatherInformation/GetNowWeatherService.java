package com.example.administrator.coolweather.weatherInformation;



import com.example.administrator.coolweather.weatherInformation.model.NowWeather;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetNowWeatherService {
    @FormUrlEncoded
    @POST("now?")
    Observable<NowWeather> getWeatherInformation(@Field("location")String location, @Field("key")String key);
}
