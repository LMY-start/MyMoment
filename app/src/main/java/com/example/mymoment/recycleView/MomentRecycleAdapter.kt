package com.example.moment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.moment.model.Comment
import com.example.moment.model.MomentMessage
import com.example.moment.recycleView.CommentRecycleAdapter
import com.example.mymoment.R
import kotlinx.android.synthetic.main.moment_item.view.*
import java.lang.StringBuilder

class MomentRecycleAdapter(val datas: List<MomentMessage>, private val context: Context) :
    Adapter<MomentRecycleAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.moment_item, null, false)
        )
    }

    override fun getItemCount(): Int {
        return datas.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        fun bind(momentMessage: MomentMessage) {
            val stringBuilder = StringBuilder()
            momentMessage.comments.forEach { comment ->
                stringBuilder.append("${comment.sender.username}: ${comment.content}").append("\n")
            }
            itemView.commentsText.text = stringBuilder.toString()

            itemView.momentName.text = momentMessage.sender.username
            itemView.describeText.text = momentMessage.content
            val field = R.mipmap::class.java.getField("touxiang")
            val id = field.getInt(field)
            itemView.momentPhoto.setImageResource(id)
        }
    }


}

