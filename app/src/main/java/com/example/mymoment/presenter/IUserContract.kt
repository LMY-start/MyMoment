package com.example.mymoment.presenter

import com.example.mymoment.model.User

interface IUserContract {

    interface IPresenter {
        fun getUserInfo()
    }

    interface IView {
        fun updateUserInfoView(user: User)
        fun displayErrorView()
    }
}