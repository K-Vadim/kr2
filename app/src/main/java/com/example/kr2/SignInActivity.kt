package com.example.kr2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText;
    lateinit var pass: EditText;
    val pattern = ("[a-z0-9]{1,100}"+"@"+"[a-z0-9]{1,100}"+"\\."+"[a-z]{1,3}")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email=findViewById(R.id.Email)
        pass=findViewById(R.id.Password)
    }
    fun emailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()

    }
    fun Sign(view: View) {
        if(email.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()){
            if (emailValid(email.text.toString())){
                val intent = Intent(this@SignInActivity,ContentActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this, "Неправильный email", Toast.LENGTH_SHORT).show()
            }
        }
        else{
            Toast.makeText(this, "Заполните поля", Toast.LENGTH_SHORT).show()
        }
    }
}