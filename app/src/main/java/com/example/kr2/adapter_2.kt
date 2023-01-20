package com.example.kr2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter_2(val con:Context, val list2: ArrayList<poster_2>):RecyclerView.Adapter<adapter_2.Link>(){
    class Link(itemView: View):RecyclerView.ViewHolder(itemView) {
        val image_id:ImageView = itemView.findViewById(R.id.imageView6)
        val text_id:TextView=itemView.findViewById(R.id.textView10)
        val text_id_2:TextView=itemView.findViewById(R.id.textView11)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter_2.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.s_rec_item,parent,false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: adapter_2.Link, position: Int) {
        holder.image_id.setImageResource(list2[position].imageId)
        holder.text_id.setText(list2[position].title)
        holder.text_id_2.setText(list2[position].title_2)
    }

    override fun getItemCount(): Int {
        return list2.size
    }

}