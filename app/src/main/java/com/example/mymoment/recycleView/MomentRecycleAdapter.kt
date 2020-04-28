package com.example.moment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.mymoment.model.MomentMessage
import com.example.mymoment.R
import kotlinx.android.synthetic.main.moment_item.view.*
import java.lang.StringBuilder

class MomentRecycleAdapter(private val context: Context) :
    Adapter<MomentRecycleAdapter.MyViewHolder>() {

    private var datas: List<MomentMessage> = listOf()

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
            momentMessage.comments?.forEach { comment ->
                stringBuilder.append("${comment.sender.username}: ${comment.content}")
                    .append("\n")
            }
            itemView.commentsText.text = stringBuilder.toString()

            itemView.momentName.text = momentMessage.sender?.username
            itemView.describeText.text = momentMessage.content

            Glide.with(context).load(momentMessage.sender?.avatar)
                .into(itemView.momentPhoto)
            Glide.with(context).load(momentMessage.images?.get(0)?.url)
                .into(itemView.describeImage)
        }
    }

    fun refresh(momentMessages: List<MomentMessage>) {
        mutableListOf<MomentMessage>()
        this.datas = momentMessages.filter {
            it.content != null && it.sender != null
        }.toList()
        notifyDataSetChanged()
    }

}

