package com.example.administrator.coolweather.weatherInformation.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.coolweather.R;
import com.example.administrator.coolweather.weatherInformation.GetWeatherInformationTask;
import com.example.administrator.coolweather.weatherInformation.WeatherInformationContract;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;
import com.example.administrator.coolweather.weatherInformation.presenter.WeatherInformationPresenter;

import java.util.List;

public class WeatherInformationActivity extends AppCompatActivity implements WeatherInformationContract.View {
    private static final String TAG = "View";
    TextView textView;
    WeatherInformationContract.Presenter mPresenter;
    GetWeatherInformationTask mTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_information);
        textView = findViewById(R.id.weather_text);
        mTask = GetWeatherInformationTask.getInstance();
        mPresenter = new WeatherInformationPresenter(this,mTask);
        this.setPresenter(mPresenter);
        setLocation("beijing");
    }



    @Override
    public void setLocation(String location) {
        mPresenter.getWeatherInfo(location);
    }

    @Override
    public void setNowWeatherInfo(NowWeather info) {
        textView.setText(info.getHeWeather6().get(0).getStatus());
    }

    @Override
    public void setLifeStyleInfo(List<NowWeather> info) {

    }

    @Override
    public void setDailyForcastInfo(List<NowWeather> info) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError() {
        Toast.makeText(this,"error",Toast.LENGTH_LONG).show();
    }

    @Override
    public void setPresenter(WeatherInformationContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
