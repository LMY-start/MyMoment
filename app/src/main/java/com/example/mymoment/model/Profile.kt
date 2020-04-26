package com.example.moment.model

import java.io.Serializable

data class Profile(
    val avatar: String,
    val nick: String,
    val username: String
) : Serializable