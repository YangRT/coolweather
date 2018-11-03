package com.example.administrator.coolweather;

import io.reactivex.disposables.Disposable;

public interface NetTask<T> {
    Disposable execute(T data,NetTaskCallback callback);
}
