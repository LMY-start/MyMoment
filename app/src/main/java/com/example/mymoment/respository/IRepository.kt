package com.example.mymoment.respository

import com.example.mymoment.model.MomentMessage
import com.example.mymoment.model.User

interface IRepository {
    fun getUserInfo(success: (user: User) -> Unit, fail: () -> Unit)
    fun getMomentMessages(success: (momentMessages: List<MomentMessage>) -> Unit, fail: () -> Unit)
}