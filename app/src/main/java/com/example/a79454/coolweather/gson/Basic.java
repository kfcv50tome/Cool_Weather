package com.example.a79454.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZOFIA on 2018/1/4 0004.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
