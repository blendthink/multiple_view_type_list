package com.honwakadeveloper.multipleviewtypelist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.honwakadeveloper.multipleviewtypelist.R

class MultipleViewTypeAdapter(
    private val listItems: Array<ListItem>
) : RecyclerView.Adapter<FavoriteBrandViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteBrandViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        return when (ListItem.type(viewType)) {

            ListItem.Type.HEADER -> {
                HeaderViewHolder(
                    inflater.inflate(
                        R.layout.list_item_view_favorite_brand_header,
                        parent,
                        false
                    )
                )
            }

            ListItem.Type.CONTENT -> {
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

    override fun getItemCount() = listItems.size

    override fun onBindViewHolder(holder: FavoriteBrandViewHolder, position: Int) {
        holder.bindView(listItems[position])
    }

    override fun getItemViewType(position: Int): Int {
        return listItems[position].viewType()
    }
}