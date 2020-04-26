package com.example.moment.model

import java.io.Serializable

data class MomentMessage(
    val content: String,
    val images: List<Image>,
    val sender: Sender,
    val comments: List<Comment>
) : Serializable