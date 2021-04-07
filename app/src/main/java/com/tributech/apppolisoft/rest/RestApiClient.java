package com.tributech.apppolisoft.rest;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiClient {

    private static OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(7000, TimeUnit.SECONDS)
            .readTimeout(7000,TimeUnit.SECONDS)
            .build();
    private static Retrofit retrofit;

    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.106:5000/appiniciarsesion")
                    .client(client).addConverterFactory(GsonConverterFactory.create(new Gson())).build();
        }
        return retrofit;
    }

}
