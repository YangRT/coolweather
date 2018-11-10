package com.example.administrator.coolweather.weatherInformation;

import com.example.administrator.coolweather.NetTaskCallback;

import io.reactivex.disposables.Disposable;

public interface WeatherTask<T> {
    Disposable execute(T data,GetWeatherCallback callback);
}
