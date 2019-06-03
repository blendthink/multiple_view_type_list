package com.honwakadeveloper.multipleviewtypelist.adapter

import kotlin.RuntimeException

abstract class MultipleTypeListItem {

    companion object {

        fun type(viewType: Int) : Type {

            val types = Type.values()

            return types.firstOrNull { it.viewType == viewType }
                ?: throw RuntimeException("Not Defined Type")
        }
    }

    enum class Type(val viewType: Int) {
        HEADER(0),
        CONTENT(1);
    }

    abstract val type : Type

    fun viewType() = type.viewType
}