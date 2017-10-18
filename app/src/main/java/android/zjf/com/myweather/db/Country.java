package android.zjf.com.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 破音D弦 on 2017/10/10.
 */

public class Country extends DataSupport {
    private int id;     //每个实体类都该有的字段
    private String countryName; //记录县的名字
    private String weatherId;   //记录县对应天气的id
    private int cityId;     //记录县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
