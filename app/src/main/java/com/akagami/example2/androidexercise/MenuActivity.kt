package com.akagami.example2.androidexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.akagami.example2.R
import com.akagami.example2.androidexercise.firstapp.FirstAppActivity
import com.akagami.example2.androidexercise.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMC = findViewById<Button>(R.id.btnIMC)
        btnSaludApp.setOnClickListener { navigateToSaludApp()}
            btnIMC.setOnClickListener { navigatoImcApp() }
            }


    private fun navigatoImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)

    }
}