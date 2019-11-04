package com.example.administrator.coolweather.weatherInformation.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.coolweather.R;
import com.example.administrator.coolweather.weatherInformation.model.HourlyWeather;

public class HourlyWeatherAdapter extends RecyclerView.Adapter<HourlyWeatherAdapter.ViewHolder> {
    private HourlyWeather infos;

    public HourlyWeatherAdapter(HourlyWeather weather){
        this.infos = weather;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hourly_weather_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvHourlyWeatherTime.setText(infos.getHeWeather6().get(0).getHourly().get(position).getTime().substring(10));
        holder.tvHourlyWeatherText.setText(infos.getHeWeather6().get(0).getHourly().get(position).getCond_txt());
        holder.tvHourlyWeatherTemp.setText(infos.getHeWeather6().get(0).getHourly().get(position).getTmp());
    }

    @Override
    public int getItemCount() {
        return infos.getHeWeather6().get(0).getHourly().size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvHourlyWeatherTime;
        TextView tvHourlyWeatherText;
        TextView tvHourlyWeatherTemp;
        public ViewHolder(View itemView) {
            super(itemView);
            tvHourlyWeatherTemp = itemView.findViewById(R.id.hourly_weather_temp);
            tvHourlyWeatherText = itemView.findViewById(R.id.hourly_weather_text);
            tvHourlyWeatherTime = itemView.findViewById(R.id.hourly_weather_time);
        }
    }
}
