package com.honwakadeveloper.multipleviewtypelist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.honwakadeveloper.multipleviewtypelist.R

class MultipleTypeListAdapter(
    private val multipleTypeListItems: Array<MultipleTypeListItem>
) : RecyclerView.Adapter<MultipleTypeListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MultipleTypeListViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        return when (MultipleTypeListItem.type(viewType)) {

            MultipleTypeListItem.Type.HEADER -> {
                HeaderTypeListViewHolder(
                    inflater.inflate(
                        R.layout.list_item_view_favorite_brand_header,
                        parent,
                        false
                    )
                )
            }

            MultipleTypeListItem.Type.CONTENT -> {
                ContentTypeListViewHolder(
                    inflater.inflate(
                        R.layout.list_item_view_favorite_brand_content,
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun getItemCount() = multipleTypeListItems.size

    override fun onBindViewHolder(holder: MultipleTypeListViewHolder, position: Int) {
        holder.bindView(multipleTypeListItems[position])
    }

    override fun getItemViewType(position: Int): Int {
        return multipleTypeListItems[position].viewType()
    }
}