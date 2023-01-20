package com.example.kr2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class poster_adapter(val con:Context, val list2:ArrayList<poster>):RecyclerView.Adapter<poster_adapter.link>() {
    class link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val image_id:ImageView=itemView.findViewById(R.id.imageView5)
        val text_id:TextView=itemView.findViewById(R.id.textView9)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): link {
        val root = LayoutInflater.from(con).inflate(R.layout.f_rec_item,parent,false)
        return link(root)
    }

    override fun onBindViewHolder(holder: link, position: Int) {
        holder.image_id.setImageResource(list2[position].imageId)
        holder.text_id.setText(list2[position].title)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}
