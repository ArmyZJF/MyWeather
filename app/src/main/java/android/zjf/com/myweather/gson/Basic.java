package android.zjf.com.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 破音D弦 on 2017/10/10.
 */

public class Basic {


    /**
     * city : 巩义
     * cnty : 中国
     * id : CN101180102
     * lat : 34.75217819
     * lon : 112.98282623
     * update : {"loc":"2017-10-10 12:46","utc":"2017-10-10 04:46"}
     */

    @SerializedName("city")
    public String cityName;
    @SerializedName("cnty")
    public String cnty;
    @SerializedName("id")
    public String weatherId;
    @SerializedName("lat")
    public String latitude;
    @SerializedName("lon")
    public String longtitude;
    @SerializedName("update")
    public Update update;

    public class Update {
        /**
         * loc : 2017-10-10 12:46
         * utc : 2017-10-10 04:46
         */

        @SerializedName("loc")
        public String updateTime;
        @SerializedName("utc")
        public String utcTime;
    }

}
