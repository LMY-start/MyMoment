package com.example.mymoment.respository

import com.example.mymoment.model.MomentMessage
import com.example.mymoment.api.ApiClient
import com.example.mymoment.model.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class RepositoryForNetWork {
    fun getUserInfo(success: (user: User) -> Unit, fail: () -> Unit) {
        val newCall = ApiClient.client.newCall(
            Request
                .Builder()
                .url(ApiClient.USER_URL)
                .get()
                .build()
        )
        newCall.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
                fail()
            }

            override fun onResponse(call: Call, response: Response) {
                val user = Gson().fromJson(response.body?.string(), User::class.java)
                success(user)
            }
        })
    }

    fun getMomentMessages(
        success: (momentMessages: MutableList<MomentMessage>) -> Unit,
        fail: () -> Unit
    ) {
        val newCall = ApiClient.client.newCall(
            Request
                .Builder()
                .url(ApiClient.TWEETS_URL)
                .get()
                .build()
        )
        newCall.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
                fail()
            }

            override fun onResponse(call: Call, response: Response) {
                val momentMessages: MutableList<MomentMessage> =
                    Gson().fromJson(
                        response.body?.string(),
                        object : TypeToken<ArrayList<MomentMessage>>() {}.type
                    )
                success(momentMessages)
            }
        })
    }


}