package com.example.moment.recycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moment.model.Comment
import com.example.mymoment.R

class CommentRecycleAdapter(val datas: List<Comment>) :
    RecyclerView.Adapter<CommentRecycleAdapter.CommentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        return CommentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.comment_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return datas.size;
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        holder.bind(datas[position])
    }


    inner class CommentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(comment: Comment) {
            val content = "${comment.sender.username}：${comment.content}"
            itemView.findViewById<TextView>(R.id.commentContent).text = content
        }
    }
}