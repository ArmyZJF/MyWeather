package android.zjf.com.myweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 破音D弦 on 2017/10/10.
 */

public class HttpUitl {
    public static void sendOkHttpRequest(String adress,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();
        client.newCall(request).enqueue(callback);
    }
}
