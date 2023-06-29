package com.akagami.example2.androidexercise.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.akagami.example2.R

class ImcCalculatorActivity : AppCompatActivity() {

    private lateinit var viewFemale:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
    }
}