package com.example.administrator.coolweather.weatherInformation.model;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("cid")
    private String cityId;

    private String location;

    @SerializedName("parent_city")
    private String parentCity;

    @SerializedName("admin_area")
    private String adminArea;

    @SerializedName("cnty")
    private String county;

    @SerializedName("lat")
    private String latitude;

    @SerializedName("lon")
    private String longitude;

    @SerializedName("tz")
    private String timeDomain;


    public String getTimeDomain() {
        return timeDomain;
    }

    public void setTimeDomain(String timeDomain) {
        this.timeDomain = timeDomain;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getParentCity() {
        return parentCity;
    }

    public void setParentCity(String parentCity) {
        this.parentCity = parentCity;
    }

    public String getAdminArea() {
        return adminArea;
    }

    public void setAdminArea(String adminArea) {
        this.adminArea = adminArea;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
