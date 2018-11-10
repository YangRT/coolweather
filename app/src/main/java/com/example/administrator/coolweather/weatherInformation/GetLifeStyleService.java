package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.weatherInformation.model.LifeStyleInformation;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetLifeStyleService {
    @FormUrlEncoded
    @POST("lifestyle?")
    Observable<LifeStyleInformation> getLifeStyleInfo(@Field("location")String location,@Field("key")String kry);
}
