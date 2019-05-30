package com.honwakadeveloper.multipleviewtypelist.favorite.brand


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.honwakadeveloper.multipleviewtypelist.R
import com.honwakadeveloper.multipleviewtypelist.favorite.brand.adapter.ContentItem
import com.honwakadeveloper.multipleviewtypelist.favorite.brand.adapter.FavoriteBrandAdapter
import com.honwakadeveloper.multipleviewtypelist.favorite.brand.adapter.HeaderItem
import kotlinx.android.synthetic.main.fragment_favorite_brand.view.*

class FavoriteBrandFragment : Fragment() {

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

        val data = arrayListOf(
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
            ContentItem()
        )

        view.favorite_brand_recycler_view.adapter = FavoriteBrandAdapter(data)
        view.favorite_brand_recycler_view.layoutManager = LinearLayoutManager(view.context, RecyclerView.VERTICAL, false)

        return view
    }
}
