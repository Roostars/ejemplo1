package com.akagami.example2.androidexercise.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatCheckedTextView
import com.akagami.example2.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tv_result = findViewById<AppCompatCheckedTextView>(R.id.tv_result)
        val name: String = intent.extras?.getString("extra_Name").orEmpty()
        tv_result.text = "Hola $name"

    }
}