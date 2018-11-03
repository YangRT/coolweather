package com.example.administrator.coolweather.weatherInformation.model;

import com.google.gson.annotations.SerializedName;

public class DailyForecast {
    @SerializedName("cond_code_d")
    private String condCodeD;
    @SerializedName("cond_code_n")
    private String condCodeN;
    @SerializedName("cond_txt_d")
    private String condTxtD;
    @SerializedName("cond_txt_n")
    private String condTxtN;
    private String date;
    private String hum;
    private String pcpn;
    private String pop;
    private String pres;
    @SerializedName("tmp_max")
    private String tmpMax;
    @SerializedName("tmp_min")
    private String tmpMin;
    @SerializedName("uv_index")
    private String uvIndex;
    private String vis;
    @SerializedName("wind_deg")
    private String windDeg;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("wind_sc")
    private String windSc;
    @SerializedName("wind_spd")
    private String windSpd;
    public void setCondCodeD(String condCodeD) {
        this.condCodeD = condCodeD;
    }
    public String getCondCodeD() {
        return condCodeD;
    }

    public void setCondCodeN(String condCodeN) {
        this.condCodeN = condCodeN;
    }
    public String getCondCodeN() {
        return condCodeN;
    }

    public void setCondTxtD(String condTxtD) {
        this.condTxtD = condTxtD;
    }
    public String getCondTxtD() {
        return condTxtD;
    }

    public void setCondTxtN(String condTxtN) {
        this.condTxtN = condTxtN;
    }
    public String getCondTxtN() {
        return condTxtN;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }
    public String getHum() {
        return hum;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }
    public String getPcpn() {
        return pcpn;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }
    public String getPop() {
        return pop;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }
    public String getPres() {
        return pres;
    }

    public void setTmpMax(String tmpMax) {
        this.tmpMax = tmpMax;
    }
    public String getTmpMax() {
        return tmpMax;
    }

    public void setTmpMin(String tmpMin) {
        this.tmpMin = tmpMin;
    }
    public String getTmpMin() {
        return tmpMin;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }
    public String getUvIndex() {
        return uvIndex;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }
    public String getVis() {
        return vis;
    }

    public void setWindDeg(String windDeg) {
        this.windDeg = windDeg;
    }
    public String getWindDeg() {
        return windDeg;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }
    public String getWindDir() {
        return windDir;
    }

    public void setWindSc(String windSc) {
        this.windSc = windSc;
    }
    public String getWindSc() {
        return windSc;
    }

    public void setWindSpd(String windSpd) {
        this.windSpd = windSpd;
    }
    public String getWindSpd() {
        return windSpd;
    }
}
