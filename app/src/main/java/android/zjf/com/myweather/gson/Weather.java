package android.zjf.com.myweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 破音D弦 on 2017/10/18.
 */

public class Weather {

        @SerializedName("aqi")
        public AQI aqi;
        @SerializedName("basic")
        public Basic basic;
        @SerializedName("now")
        public Now now;
        @SerializedName("status")
        public String status;
        @SerializedName("suggestion")
        public Suggestion suggestion;
        @SerializedName("daily_forecast")
        public List<Forecast> forecastList;

}
