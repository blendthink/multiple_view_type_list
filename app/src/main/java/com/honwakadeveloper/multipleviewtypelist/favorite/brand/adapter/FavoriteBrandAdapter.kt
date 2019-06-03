package com.honwakadeveloper.multipleviewtypelist.favorite.brand.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.honwakadeveloper.multipleviewtypelist.R

class FavoriteBrandAdapter(
    private val favoriteBrandItems: Array<FavoriteBrandItem>
) : RecyclerView.Adapter<FavoriteBrandViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteBrandViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        return when (FavoriteBrandItem.type(viewType)) {

            FavoriteBrandItem.Type.HEADER -> {
                HeaderViewHolder(
                    inflater.inflate(
                        R.layout.list_item_view_favorite_brand_header,
                        parent,
                        false
                    )
                )
            }

            FavoriteBrandItem.Type.CONTENT -> {
                ContentViewHolder(
                    inflater.inflate(
                        R.layout.list_item_view_favorite_brand_content,
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun getItemCount() = favoriteBrandItems.size

    override fun onBindViewHolder(holder: FavoriteBrandViewHolder, position: Int) {
        holder.bindView(favoriteBrandItems[position])
    }

    override fun getItemViewType(position: Int): Int {
        return favoriteBrandItems[position].viewType()
    }
}