package com.honwakadeveloper.multipleviewtypelist.favorite.brand.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class FavoriteBrandViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bindView(favoriteBrandItem: FavoriteBrandItem)
}