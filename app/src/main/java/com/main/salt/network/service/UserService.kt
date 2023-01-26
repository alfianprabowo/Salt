package com.main.salt.network.service

import com.main.salt.data.model.User
import retrofit2.http.*

interface UserService {

    @Headers("Content-Type: application/json")
    @POST("login")
    suspend fun login(
        @Body email:String,
        @Body password:String,
    ) : User

    @Headers("Content-Type: application/json")
    @GET("users/{id")
    suspend fun getUser(
        @Path("id") id: Int,
    ) : User
}