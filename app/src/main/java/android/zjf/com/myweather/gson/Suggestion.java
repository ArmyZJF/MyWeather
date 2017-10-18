package android.zjf.com.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 破音D弦 on 2017/10/18.
 */

public class Suggestion {
        /**
         * comf : {"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"}
         * cw : {"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}
         * sport : {"brf":"较适宜","txt":"阴天，较适宜进行各种户内外运动。"}
         */

        @SerializedName("comf")
        public Comfort comfort;
        @SerializedName("cw")
        public CarWash carWash;
        @SerializedName("sport")
        public Sport sport;

        public  class Comfort {
            /**
             * brf : 舒适
             * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
             */
            @SerializedName("txt")
            public String info;
        }
        public class CarWash{
            @SerializedName("txt")
            public String ifno;
        }
        public class Sport{
            @SerializedName("txt")
            public String info;
        }

}
