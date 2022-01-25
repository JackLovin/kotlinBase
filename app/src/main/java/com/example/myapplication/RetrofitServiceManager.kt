package com.example.myapplication

import android.content.Context
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

object RetrofitServiceManager {
    private val BASE_URL = "https://www.wanandroid.com"
    private var service: WanandroidApi? = null

    /**
     * 通过Retrofit的动态代理生成TranslateService实现类
     */
    fun getApi(): WanandroidApi {
        if (null == service) {

            val client = OkHttpClient.Builder()
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            service = retrofit.create(WanandroidApi::class.java)
        }

        return service!!
    }
}