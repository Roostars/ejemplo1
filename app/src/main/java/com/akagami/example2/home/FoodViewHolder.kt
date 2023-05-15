package com.akagami.example2.home

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akagami.example2.data.FoodModel

class FoodViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private lateinit var tittle: TextView
    private lateinit var calories: TextView
    private lateinit var meet:TextView
    private lateinit var fat:TextView


    fun setView(foodModel: FoodModel){

    }
}