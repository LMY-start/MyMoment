package com.example.mymoment.presenter

import com.example.mymoment.model.MomentMessage

interface IMomentContract {

    interface IPresenter {
        fun getMomentMessages()
    }

    interface IView {
        fun updateMomentMessageView(momentMessages: List<MomentMessage>)
        fun displayErrorView()
    }
}