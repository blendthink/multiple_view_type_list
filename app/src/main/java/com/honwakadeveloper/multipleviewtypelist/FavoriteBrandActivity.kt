package com.honwakadeveloper.multipleviewtypelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FavoriteBrandActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_brand)

        if (savedInstanceState == null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.fragment_container,
                FavoriteBrandFragment.newInstance(), null)
            transaction.commit()
        }
    }
}
