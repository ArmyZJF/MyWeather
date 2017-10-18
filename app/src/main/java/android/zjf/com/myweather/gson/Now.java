package android.zjf.com.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 破音D弦 on 2017/10/18.
 */

public class Now {
    /**
     * cond : {"code":"104","txt":"阴"}
     * fl : 12
     * hum : 80
     * pcpn : 0
     * pres : 1025
     * tmp : 14
     * vis : 5
     * wind : {"deg":"228","dir":"西南风","sc":"微风","spd":"6"}
     */

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public String tmperature;


    public class More {
        /**
         * code : 104
         * txt : 阴
         */
        @SerializedName("txt")
        public String info;
    }

}
