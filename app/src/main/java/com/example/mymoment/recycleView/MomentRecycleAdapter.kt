package com.example.moment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.moment.model.MomentMessage
import com.example.mymoment.R
import kotlinx.android.synthetic.main.moment_item.view.*

class MomentRecycleAdapter(val datas: List<MomentMessage>) :
    Adapter<MomentRecycleAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.moment_item, null)
        )
    }

    override fun getItemCount(): Int {
        return datas.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = datas[position]
        holder.itemView.momentName.text = data.sender.username
        holder.itemView.describeText.text = data.content
        val field = R.mipmap::class.java.getField("touxiang")
        val id = field.getInt(field)
        holder.itemView.momentPhoto.setImageResource(id)
    }

    inner class MyViewHolder(itemView: View) : ViewHolder(itemView)


}

