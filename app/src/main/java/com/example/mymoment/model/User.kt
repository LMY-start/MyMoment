package com.example.mymoment.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(
    @SerializedName("profile-image")
    val profileImage: String,
    val avatar: String,
    val nick: String,
    val username: String
):Serializable