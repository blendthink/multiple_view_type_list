package com.honwakadeveloper.multipleviewtypelist.favorite.brand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.honwakadeveloper.multipleviewtypelist.R

class FavoriteBrandActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_brand)

        if (savedInstanceState == null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(FavoriteBrandFragment.newInstance(), null)
            transaction.commit()
        }
    }
}
