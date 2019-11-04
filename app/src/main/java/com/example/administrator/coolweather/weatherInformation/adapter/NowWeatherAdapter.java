package com.example.administrator.coolweather.weatherInformation.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.coolweather.R;
import com.example.administrator.coolweather.weatherInformation.model.NowWeather;

public class NowWeatherAdapter extends RecyclerView.Adapter<NowWeatherAdapter.ViewHolder> {
    private NowWeather nowWeather;

    public NowWeatherAdapter(NowWeather nowWeather){
        this.nowWeather = nowWeather;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.now_weather_information_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(position == 0){
            holder.ivNowWeatherIcon.setImageResource(R.drawable.wdj);
            holder.tvNowWeatherTitle.setText("体感温度");
            holder.tvNowWeatherData.setText(String.format("%s℃", nowWeather.getHeWeather6().get(0).getNow().getFl()));
        }else if(position == 1){
            holder.ivNowWeatherIcon.setImageResource(R.drawable.xdxd);
            holder.tvNowWeatherTitle.setText("相对湿度");
            holder.tvNowWeatherData.setText(nowWeather.getHeWeather6().get(0).getNow().getHum());
        }else if (position == 2){
            holder.ivNowWeatherIcon.setImageResource(R.drawable.njd);
            holder.tvNowWeatherTitle.setText("能见度");
            holder.tvNowWeatherData.setText(String.format("%skm", nowWeather.getHeWeather6().get(0).getNow().getVis()));
        } else if(position == 3){
            holder.ivNowWeatherIcon.setImageResource(R.drawable.dqyq);
            holder.tvNowWeatherTitle.setText("大气压强");
            holder.tvNowWeatherData.setText(nowWeather.getHeWeather6().get(0).getNow().getPres());
        }else if (position == 4){
            holder.ivNowWeatherIcon.setImageResource(R.drawable.flfj);
            holder.tvNowWeatherTitle.setText("风向风力");
            holder.tvNowWeatherData.setText(String.format("%s%s级", nowWeather.getHeWeather6().get(0).getNow().getWind_dir(), nowWeather.getHeWeather6().get(0).getNow().getWind_sc()));
        }else if (position == 5){
            holder.ivNowWeatherIcon.setImageResource(R.drawable.jyl);
            holder.tvNowWeatherTitle.setText("降水量");
            holder.tvNowWeatherData.setText(nowWeather.getHeWeather6().get(0).getNow().getPcpn());
        }

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNowWeatherTitle;
        TextView tvNowWeatherData;
        ImageView ivNowWeatherIcon;
        public ViewHolder(View itemView) {
            super(itemView);
            tvNowWeatherData = itemView.findViewById(R.id.now_weather_data);
            tvNowWeatherTitle = itemView.findViewById(R.id.now_weather_title);
            ivNowWeatherIcon = itemView.findViewById(R.id.now_weather_icon);
        }
    }
}
