package com.main.salt.data.api

import com.main.salt.data.source.remote.LoginResponse
import com.main.salt.data.source.remote.UserResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("login")
    suspend fun login():Response<LoginResponse>

    @GET("/users/")
    suspend fun fetchUser():Response<UserResponse>
}