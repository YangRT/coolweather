package com.example.administrator.coolweather.weatherInformation.model;

import java.util.List;

public class LifeStyleInfo {
    private Basic basic;
    private List<LifeStyle> lifeStyle;
    private Update update;
    private String status;

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public List<LifeStyle> getLifeStyle() {
        return lifeStyle;
    }

    public void setLifeStyle(List<LifeStyle> lifeStyle) {
        this.lifeStyle = lifeStyle;
    }

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
