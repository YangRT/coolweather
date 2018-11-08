package com.example.administrator.coolweather.weatherInformation;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface GetLifeStyleService {
    @FormUrlEncoded
    @POST("lifestyle?")
    Observable<LifeStyleInfo> getLifeStyleInfo(String location);
}
