package com.akagami.example2.androidexercise.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.akagami.example2.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btn_1 = findViewById<AppCompatButton>(R.id.btn_1)
        val et_1 = findViewById<AppCompatEditText>(R.id.et_1)


        btn_1.setOnClickListener {
            val name = et_1.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("extra_Name",name)
                startActivity(intent)
            }
        }
    }
}