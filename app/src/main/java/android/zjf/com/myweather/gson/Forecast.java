package android.zjf.com.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 破音D弦 on 2017/10/18.
 */

public class Forecast {
    @SerializedName("cond")
    public More more;
    @SerializedName("date")
    public String date;
    @SerializedName("tmp")
    public Tmperature tmperature;


    public static class More {
        @SerializedName("txt_d")
        public String info;

    }

    public class Tmperature {
        /**
         * max : 17
         * min : 11
         */

        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }


}
