package com.akagami.example2.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akagami.example2.R
import com.akagami.example2.data.FoodModel
import com.akagami.example2.home.adapter.FoodAdapter


class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var rvFood:RecyclerView
    private lateinit var adapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val foodList= arrayListOf(
            FoodModel("imagen1","Comida1","120","45","2.3%"),
            FoodModel("imagen1","Comida1","120","45","2.3%"),
            FoodModel("imagen1","Comida1","120","45","2.3%"),
            FoodModel("imagen1","Comida1","120","45","2.3%"),
            FoodModel("imagen1","Comida1","120","45","2.3%"),
            FoodModel("imagen1","Comida1","120","45","2.3%")
        )
        rvFood=findViewById(R.id.rv_food)
        adapter= FoodAdapter()
        adapter.foodList=foodList
        rvFood.layoutManager= LinearLayoutManager(this)
        rvFood.adapter=adapter

    }
}