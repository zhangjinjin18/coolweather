package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by csszjj18 on 2017/11/21.
 */

public class City extends DataSupport {
        private int id;
        private String cityName;
        private String cityCode;
        private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public String getCityCode(){
        return cityCode;
    }
    public void setCityCode(String cityCode){
        this.cityCode = cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setPronvinceId(int provinceId){
        this.provinceId = provinceId;
    }

}


