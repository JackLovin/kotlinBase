package com.example.myapplication

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface WanandroidApi {

    @POST("/user/login")
    @FormUrlEncoded
    suspend fun login(@Field("username")username: String,@Field("password") password: String): RespBean
}