package com.example.lunchtrayapp.model

import androidx.annotation.StringRes

sealed class MenuItem(
    @StringRes open val nameRes: Int,
    @StringRes open val descRes: Int,
    open val price: Double
) {
    class Entree(nameRes: Int, descRes: Int, price: Double)
        : MenuItem(nameRes, descRes, price)

    class SideDish(nameRes: Int, descRes: Int, price: Double)
        : MenuItem(nameRes, descRes, price)

    class Accompaniment(nameRes: Int, descRes: Int, price: Double)
        : MenuItem(nameRes, descRes, price)
}