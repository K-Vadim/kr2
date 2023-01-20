package com.example.kr2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        val poster_res:RecyclerView=findViewById((R.id.Rec_view))
        poster_res.adapter=poster_adapter(this,posterList().list)

        val poster_res_2:RecyclerView=findViewById(R.id.Rec_view2)
        poster_res_2.adapter=adapter_2(this,posterList_2().list)
    }
}