package com.example.mymoment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moment.MomentRecycleAdapter
import com.example.mymoment.model.DataUtils
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_scrolling.*

class MainActivity : AppCompatActivity() {

    val datas = DataUtils().createMomentMessagesData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myPhoto.setOnClickListener { view ->
            Snackbar.make(view, "photo is click", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        camera.setOnClickListener { view ->
            Snackbar.make(view, "camera is click", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        momentRecycle.layoutManager = LinearLayoutManager(this)
        momentRecycle.adapter = MomentRecycleAdapter(datas)
        momentRecycle.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
//        commentRecycle


    }

}
