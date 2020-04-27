package com.example.mymoment.presenter

import com.example.mymoment.respository.UserRepository

class UserPresenter(private val userRepository: UserRepository): IUserContract.IPresenter {

    private var view: IUserContract.IView? = null

    fun attach(view: IUserContract.IView) {
       this.view = view
    }

    fun detach() {
        this.view = null
    }

    override fun getUserInfo() {
        userRepository.getUserInfo({user ->
            view?.let {
                it.updateUserInfoView(user)
            }
        }, {

            view?.let {
                it.displayErrorView()
            }
        });
    }
}