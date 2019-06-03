package com.honwakadeveloper.multipleviewtypelist.favorite.brand.adapter

import java.lang.RuntimeException

abstract class FavoriteBrandItem {

    companion object {

        fun type(viewType: Int) : Type {

            val types = Type.values()

            types.forEach {
                if (it.viewType == viewType) {
                    return it
                }
            }

            throw RuntimeException("Not Defined Type")
        }
    }

    enum class Type(val viewType: Int) {
        HEADER(0),
        CONTENT(1);
    }

    abstract val type : Type

    fun viewType() = type.viewType
}