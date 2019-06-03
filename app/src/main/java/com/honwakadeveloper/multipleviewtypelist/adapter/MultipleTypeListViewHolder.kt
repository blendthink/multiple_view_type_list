package com.honwakadeveloper.multipleviewtypelist.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class MultipleTypeListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bindView(multipleTypeListItem: MultipleTypeListItem)
}