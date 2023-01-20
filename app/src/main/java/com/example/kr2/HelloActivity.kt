package com.example.kr2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
    }

    fun Sign(view: View) {
        val intent = Intent (this@HelloActivity, SignInActivity::class.java)
        startActivity(intent)
    }
}