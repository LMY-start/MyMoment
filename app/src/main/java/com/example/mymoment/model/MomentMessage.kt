package com.example.mymoment.model

data class MomentMessage(
    val content: String?,
    val images: List<MyImage>?,
    val sender: Sender?,
    val comments: List<Comment>?
)


data class Comment(
    val content: String,
    val sender: Sender
)

data class MyImage(
    val url: String
)


data class Sender(
    val username: String,
    val nick: String,
    val avatar: String
)