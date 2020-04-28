package com.example.mymoment

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.moment.MomentRecycleAdapter
import com.example.mymoment.model.MomentMessage
import com.example.mymoment.model.User
import com.example.mymoment.presenter.IMomentContract
import com.example.mymoment.presenter.IUserContract
import com.example.mymoment.presenter.MomentPresenter
import com.example.mymoment.presenter.UserPresenter
import com.example.mymoment.respository.RepositoryForNetWork
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_scrolling.*

class MainActivity : AppCompatActivity(), IUserContract.IView, IMomentContract.IView {

    private val userPresenter = UserPresenter(RepositoryForNetWork())
    private val momentPresenter = MomentPresenter(RepositoryForNetWork())
    private val momentRecycleAdapter = MomentRecycleAdapter(this)

    override fun onDestroy() {
        super.onDestroy()
        userPresenter.detach()
        momentPresenter.detach()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userPresenter.attach(this)
        momentPresenter.attach(this)

        momentRecycle.layoutManager = LinearLayoutManager(this)
        momentRecycle.adapter = momentRecycleAdapter
        momentRecycle.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        myPhoto.setOnClickListener { view ->
            Snackbar.make(view, "photo is click", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        camera.setOnClickListener { view ->
            Snackbar.make(view, "camera is click", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun updateUserInfoView(user: User) {
        runOnUiThread {
            with(user) {
                Glide.with(this@MainActivity).load(profileImage).placeholder(R.mipmap.view_bg)
                    .into(background)
                Glide.with(this@MainActivity).load(avatar).placeholder(R.mipmap.touxiang)
                    .into(myPhoto)
                myName.text = nick
            }
        }
    }


    override fun updateMomentMessageView(momentMessages: List<MomentMessage>) {
        runOnUiThread {
            println("updateMomentMessageView ===============${momentMessages}")
            momentRecycleAdapter.refresh(momentMessages)
        }
    }


    override fun displayErrorView() {
        runOnUiThread {
            Toast.makeText(this, "Get User Error", Toast.LENGTH_SHORT).show()
        }
    }

}
