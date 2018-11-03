package com.example.administrator.coolweather.weatherInformation;



import com.example.administrator.coolweather.weatherInformation.model.NowWeatherInfo;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetNowWeatherService {
    @FormUrlEncoded
    @POST("now?")
    Observable<NowWeatherInfo> getWeatherInformation(String location);
}
