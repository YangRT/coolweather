package com.example.administrator.coolweather.weatherInformation.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.coolweather.R;
import com.example.administrator.coolweather.weatherInformation.GetWeatherCallback;
import com.example.administrator.coolweather.weatherInformation.GetWeatherInformationTask;
import com.example.administrator.coolweather.weatherInformation.WeatherInformationContract;
import com.example.administrator.coolweather.weatherInformation.adapter.NowWeatherAdapter;
import com.example.administrator.coolweather.weatherInformation.model.AirCondition;
import com.example.administrator.coolweather.weatherInformation.model.LifeStyleInformation;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;
import com.example.administrator.coolweather.weatherInformation.model.WeatherForecast;
import com.example.administrator.coolweather.weatherInformation.presenter.WeatherInformationPresenter;

import java.util.List;

public class WeatherInformationActivity extends AppCompatActivity implements WeatherInformationContract.View {
    private static final String TAG = "View";
    WeatherInformationContract.Presenter mPresenter;
    GetWeatherInformationTask mTask;
    TextView tvWeather;
    TextView tvTemp;
    NowWeatherAdapter adapter;
    RecyclerView nowWeather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_information);
        Toolbar toolbar = findViewById(R.id.toolbar_weather);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        mTask = GetWeatherInformationTask.getInstance();
        mPresenter = new WeatherInformationPresenter(this,mTask);
        this.setPresenter(mPresenter);
        tvTemp = findViewById(R.id.now_tmp);
        tvWeather = findViewById(R.id.now_weather);
        nowWeather = findViewById(R.id.now_weather_information);
        nowWeather.setLayoutManager(new GridLayoutManager(this,3));
        String location = intent.getStringExtra("location");
        if (location == null){
            setLocation("auto_ip");
        }else {
            setLocation(location);
        }
    }



    @Override
    public void setLocation(String location) {
        mPresenter.getWeatherInfo(location);
    }

    @Override
    public void setNowWeatherInfo(NowWeather info) {
        adapter = new NowWeatherAdapter(info);
       if(getSupportActionBar()!= null){
           getSupportActionBar().setTitle(info.getHeWeather6().get(0).getBasic().getLocation());
       }
        nowWeather.setAdapter(adapter);
        tvWeather.setText(info.getHeWeather6().get(0).getNow().getCond_txt());
        tvTemp.setText(String.format("%s℃", info.getHeWeather6().get(0).getNow().getTmp()));
    }

    @Override
    public void setLifeStyleInfo(LifeStyleInformation info) {

    }

    @Override
    public void setDailyForecastInfo(WeatherForecast info) {

    }

    @Override
    public void setAirConditionInfo(AirCondition info) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String error) {

        Toast.makeText(this,"error",Toast.LENGTH_LONG).show();
    }

    @Override
    public void setPresenter(WeatherInformationContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
