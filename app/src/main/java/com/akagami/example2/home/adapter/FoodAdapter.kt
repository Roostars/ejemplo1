package com.akagami.example2.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akagami.example2.R
import com.akagami.example2.data.FoodModel
import com.akagami.example2.home.viewholders.FoodViewHolder

class FoodAdapter() :
    RecyclerView.Adapter<FoodViewHolder>() {
     var foodList: ArrayList<FoodModel> = arrayListOf()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FoodViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_food_card_view, viewGroup, false)

        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
       val food=foodList[position]
        holder.setView(food)
    }


    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = foodList.size

}