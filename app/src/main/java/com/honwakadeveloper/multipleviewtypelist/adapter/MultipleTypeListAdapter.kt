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

            MultipleTypeListItem.Type.TYPE_A -> {
                HeaderTypeListViewHolder(
                    inflater.inflate(
                        R.layout.list_item_view_multiple_type_list_type_a,
                        parent,
                        false
                    )
                )
            }

            MultipleTypeListItem.Type.TYPE_B -> {
                ContentTypeListViewHolder(
                    inflater.inflate(
                        R.layout.list_item_view_multiple_type_list_type_b,
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