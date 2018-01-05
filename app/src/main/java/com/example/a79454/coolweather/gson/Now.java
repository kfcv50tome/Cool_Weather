package com.example.a79454.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZOFIA on 2018/1/4 0004.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
