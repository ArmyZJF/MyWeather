package android.zjf.com.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 破音D弦 on 2017/10/10.
 */

public class City extends DataSupport {
    private int id; //每个实体类都该有的字段
    private String cityName;    //记录市的名字
    private int cityCode;   //记录市的代号
    private int provinceId; //记录当前所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
