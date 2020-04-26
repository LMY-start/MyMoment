package com.example.mymoment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moment.ListData
import com.example.moment.MyRecycleAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_scrolling.*
import kotlinx.android.synthetic.main.moment_item.*

class MainActivity : AppCompatActivity() {

    val datas = ListData().createData()
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
        momentRecycle.adapter = MyRecycleAdapter(datas)
        momentRecycle.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
//        commentRecycle


    }

}
