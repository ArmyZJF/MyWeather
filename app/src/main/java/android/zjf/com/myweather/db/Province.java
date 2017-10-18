package android.zjf.com.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 破音D弦 on 2017/10/10.
 */

public class Province extends DataSupport{
    private int id;     //每个实体类都该有的字段
    private String provinceName;    //记录省的名字
    private int provinceCode;   //记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
