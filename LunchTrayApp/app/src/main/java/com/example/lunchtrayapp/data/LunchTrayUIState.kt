package com.example.lunchtrayapp.data

import com.example.lunchtrayapp.model.MenuItem

data class LunchTrayUIState(
    val entree: MenuItem.Entree? = null,
    val sideDish: MenuItem.SideDish? = null,
    val accompaniment: MenuItem.Accompaniment? = null,
    val subtotal: Double = 0.0,
    val tax: Double = 0.0,
    val total: Double = 0.0,
    val pickupOptions: List<String> = emptyList()
)

