package com.example.administrator.coolweather.weatherInformation;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetDailyForecastService {
    @FormUrlEncoded
    @POST("forecast?")
    Observable<DailyForecastInfo> getDailyForecastInfo(String location);
}
