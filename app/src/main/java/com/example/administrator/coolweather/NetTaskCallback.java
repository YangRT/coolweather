package com.example.administrator.coolweather;

public interface NetTaskCallback<T> {
    void onSuccess(T t);
    void onStart();
    void onFailed(String msg);
    void onFinish();
}
