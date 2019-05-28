package com.honwakadeveloper.multipleviewtypelist.favorite.brand


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.honwakadeveloper.multipleviewtypelist.R
import kotlinx.android.synthetic.main.fragment_favorite_brand.*

class FavoriteBrandFragment : Fragment() {

    companion object {
        fun newInstance(): FavoriteBrandFragment {
            return FavoriteBrandFragment()
        }
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_favorite_brand, container, false)

        val data = arrayOf(1,2)

        return view
    }
}
