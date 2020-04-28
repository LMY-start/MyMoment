package com.example.mymoment.presenter

import com.example.mymoment.respository.RepositoryForNetWork

class MomentPresenter(private val repositoryForNetWork: RepositoryForNetWork) : IMomentContract.IPresenter {

    private var view: IMomentContract.IView? = null

    fun attach(view: IMomentContract.IView) {
        this.view = view
        getMomentMessages()
    }

    fun detach() {
        this.view = null
        // stop network
    }

    override fun getMomentMessages() {
        repositoryForNetWork.getMomentMessages({ momentMessages ->
            view?.updateMomentMessageView(momentMessages)
        }, {
            view?.displayErrorView()
        })
    }
}