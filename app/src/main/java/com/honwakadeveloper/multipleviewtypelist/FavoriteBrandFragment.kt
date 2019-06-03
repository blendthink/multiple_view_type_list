package com.honwakadeveloper.multipleviewtypelist


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.honwakadeveloper.multipleviewtypelist.adapter.ContentItem
import com.honwakadeveloper.multipleviewtypelist.adapter.FavoriteBrandAdapter
import com.honwakadeveloper.multipleviewtypelist.adapter.FavoriteBrandItem
import com.honwakadeveloper.multipleviewtypelist.adapter.HeaderItem

class FavoriteBrandFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: FavoriteBrandAdapter
    private lateinit var viewManager: GridLayoutManager

    companion object {
        fun newInstance(): FavoriteBrandFragment {
            return FavoriteBrandFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_favorite_brand, container, false)

        val data: Array<FavoriteBrandItem> = arrayOf(
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

                return when (FavoriteBrandItem.type(viewType)) {
                    FavoriteBrandItem.Type.HEADER -> 3
                    FavoriteBrandItem.Type.CONTENT -> 1
                }
            }

        }

        viewAdapter = FavoriteBrandAdapter(data)

        recyclerView = view.findViewById<RecyclerView>(R.id.favorite_brand_recycler_view).apply {

            layoutManager = viewManager

            adapter = viewAdapter
        }

        return view
    }
}
