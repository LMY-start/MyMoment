package com.example.moment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoment.R

class MyRecycleAdapter(val datas: MutableList<ListData.Data>) :
    RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.moment_item,null)
        )
    }

    override fun getItemCount(): Int {
        return datas.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(datas[position])
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: ListData.Data) {
            itemView.findViewById<TextView>(R.id.nameText).text = data.name
            val field = R.mipmap::class.java.getField(data.image)
            val id = field.getInt(field)
            itemView.findViewById<ImageView>(R.id.imageView).setImageResource(id)

        }
    }
}