package com.example.administrator.coolweather.city;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class cityListAdapter extends RecyclerView.Adapter<cityListAdapter.cityListViewHolder> {
    private List<String> mCityList = new ArrayList<>();
    @NonNull
    @Override
    public cityListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull cityListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mCityList.size();
    }

     class cityListViewHolder extends RecyclerView.ViewHolder{
        private TextView cityName;
         public cityListViewHolder(View itemView) {
             super(itemView);
         }
     }
}
