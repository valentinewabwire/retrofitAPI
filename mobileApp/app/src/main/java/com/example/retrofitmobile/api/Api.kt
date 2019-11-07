package com.example.retrofitmobile.api

import com.example.retrofitmobile.models.DefaultResponse
import com.example.retrofitmobile.models.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("createuser")

    fun createuser(
        @Field("email") email:String,
        @Field("name") name:String,
        @Field("password") password:String,
        @Field("school") school:String
    ):Call<DefaultResponse>

    @FormUrlEncoded
    @POST("userlogin")
    fun userlogin(
        @Field("email") email: String,
        @Field("password") password: String
    ):Call<LoginResponse>

}