package android.zjf.com.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 破音D弦 on 2017/10/18.
 */

public class AQI {


    /**
     * city : {"aqi":"38","pm10":"38","pm25":"26","qlty":"优"}
     */

    @SerializedName("city")
    public AQICity city;

    public class AQICity {
        /**
         * aqi : 38
         * pm10 : 38
         * pm25 : 26
         * qlty : 优
         */

        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm10")
        public String pm10;
        @SerializedName("pm25")
        public String pm25;
        @SerializedName("qlty")
        public String qlty;
    }

}
