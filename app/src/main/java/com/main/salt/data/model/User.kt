package com.main.salt.data.model

import com.google.gson.annotations.SerializedName

data class User(

    @field:SerializedName("id")
    var id: Int? = null,

    @field:SerializedName("email")
    var email: String? = null,

    @field:SerializedName("password")
    var password: String? = null,

    @field:SerializedName("first_name")
    var first_name: String? = null,

    @field:SerializedName("last_name")
    var last_name: String? = null,

    @field:SerializedName("avatar")
    var avatar: String? = null,


    )
