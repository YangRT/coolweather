package com.example.administrator.coolweather.utils;

import android.os.Build;
import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetUtils {
    private static NetUtils netUtils = null;

    public static NetUtils getInstance(){
        if(netUtils == null){
            netUtils = new NetUtils();
        }
        return netUtils;
    }
    public OkHttpClient getClientInstance() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        return builder.build();
    }
    public Retrofit getRetrofitInstance(String url) {
        OkHttpClient client = getClientInstance();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }
}
