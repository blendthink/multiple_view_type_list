package com.honwakadeveloper.multipleviewtypelist


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.honwakadeveloper.multipleviewtypelist.adapter.ContentItem
import com.honwakadeveloper.multipleviewtypelist.adapter.MultipleViewTypeAdapter
import com.honwakadeveloper.multipleviewtypelist.adapter.ListItem
import com.honwakadeveloper.multipleviewtypelist.adapter.HeaderItem

class MultipleViewTypeListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: MultipleViewTypeAdapter
    private lateinit var viewManager: GridLayoutManager

    companion object {
        fun newInstance(): MultipleViewTypeListFragment {
            return MultipleViewTypeListFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_multiple_view_type_list, container, false)

        val data: Array<ListItem> = arrayOf(
            HeaderItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            HeaderItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem(),
            ContentItem()
        )

        viewManager = GridLayoutManager(context, 3)
        viewManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {

                val viewType = viewAdapter.getItemViewType(position)

                return when (ListItem.type(viewType)) {
                    ListItem.Type.HEADER -> 3
                    ListItem.Type.CONTENT -> 1
                }
            }

        }

        viewAdapter = MultipleViewTypeAdapter(data)

        recyclerView = view.findViewById<RecyclerView>(R.id.multiple_view_type_list_recycler_view).apply {

            layoutManager = viewManager

            adapter = viewAdapter
        }

        return view
    }
}
