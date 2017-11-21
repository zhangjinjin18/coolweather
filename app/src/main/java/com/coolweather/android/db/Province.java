package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by csszjj18 on 2017/11/21.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private String provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setPronvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public String getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode){
        this.provinceCode = provinceCode;
    }
}
