package com.example.mymoment

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.moment.MomentRecycleAdapter
import com.example.moment.recycleView.DataUtils
import com.example.mymoment.model.User
import com.example.mymoment.presenter.IUserContract
import com.example.mymoment.presenter.UserPresenter
import com.example.mymoment.respository.UserRepository
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_scrolling.*

class MainActivity : AppCompatActivity(), IUserContract.IView {

    private val presenter = UserPresenter(UserRepository())
    private val datas = DataUtils().createMomentMessagesData()

    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.attach(this)
        presenter.getUserInfo()

        momentRecycle.layoutManager = LinearLayoutManager(this)
        momentRecycle.adapter = MomentRecycleAdapter(datas, this)
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
                Glide.with(this@MainActivity).load(avatar).error(R.mipmap.view_bg)
                    .into(myPhoto)
                Glide.with(this@MainActivity).load(profileImage).into(background)
                myName.text = nick
            }
        }
    }

    override fun displayErrorView() {
        runOnUiThread {
            Toast.makeText(this, "Get User Error", Toast.LENGTH_SHORT).show()
        }
    }

}
