package com.honwakadeveloper.multipleviewtypelist.adapter

import android.view.View
import kotlinx.android.synthetic.main.list_item_view_multiple_type_list_type_a.view.*

class TypeAViewHolder(itemView: View) : MultipleTypeListViewHolder(itemView) {
    override fun bindView(multipleTypeListItem: MultipleTypeListItem) {

        if (multipleTypeListItem !is TypeAListItem) {
            return
        }

        itemView.title.text = multipleTypeListItem.name
    }
}