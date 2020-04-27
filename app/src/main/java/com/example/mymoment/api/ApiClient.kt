package com.example.mymoment.api

import okhttp3.OkHttpClient

object ApiClient {

    const val USER_URL = "https://thoughtworks-ios.herokuapp.com/user/jsmith"
    const val TWEETS_URL = "https://thoughtworks-ios.herokuapp.com/user/jsmith/tweets"

    val client by lazy(LazyThreadSafetyMode.NONE) {
        OkHttpClient.Builder().addInterceptor(HttpInterceptor()).build()
    }
}