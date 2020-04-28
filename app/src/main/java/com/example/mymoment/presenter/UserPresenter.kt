package com.example.mymoment.presenter

import com.example.mymoment.respository.RepositoryForNetWork

class UserPresenter(private val repositoryForNetWork: RepositoryForNetWork) : IUserContract.IPresenter {

    private var view: IUserContract.IView? = null

    fun attach(view: IUserContract.IView) {
        this.view = view
        getUserInfo()
    }

    fun detach() {
        this.view = null
        // stop network
    }

    override fun getUserInfo() {
        repositoryForNetWork.getUserInfo({ user ->
            view?.updateUserInfoView(user)
        }, {

            view?.displayErrorView()
        });
    }

}