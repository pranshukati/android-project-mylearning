package com.example.lunchtrayapp.data
import com.example.lunchtrayapp.R
import com.example.lunchtrayapp.model.MenuItem
import com.example.lunchtrayapp.model.MenuItem.Entree
import com.example.lunchtrayapp.model.MenuItem.SideDish
import com.example.lunchtrayapp.model.MenuItem.Accompaniment
object DataSource {

    val entreeMenuItems by lazy {
        listOf(
        Entree(
            nameRes = R.string.cauliflower,
            descRes = R.string.cauliflower_desc,
            price = 7.00,
        ),
        Entree(
            nameRes = R.string.three_bean_chili,
            descRes = R.string.three_bean_chili_desc,
            price = 4.00,
        ),
        Entree(
            nameRes = R.string.mushroom_pasta,
            descRes = R.string.mushroom_pasta_desc,
            price = 5.50,
        ),
        Entree(
            nameRes = R.string.spicy_black_bean_skillet,
            descRes = R.string.spicy_black_bean_skillet_desc,
            price = 5.50,
        )
    )
    }

    val sideDishMenuItems = listOf(
        MenuItem.SideDish(
            nameRes = R.string.summer_salad,
            descRes = R.string.summer_salad_desc,
            price = 2.50,
        ),
        SideDish(
            nameRes = R.string.butternut_squash_soup,
            descRes = R.string.butternut_squash_soup_desc,
            price = 3.00,
        ),
        SideDish(
            nameRes = R.string.spicy_potatoes,
            descRes = R.string.spicy_potatoes_desc,
            price = 2.00,
        ),
        SideDish(
            nameRes = R.string.coconut_rice,
            descRes = R.string.coconut_rice_desc,
            price = 1.50,
        )
    )

    val accompanimentMenuItems = listOf(
        Accompaniment(
            nameRes = R.string.lunch_roll,
            descRes = R.string.lunch_roll_desc,
            price = 0.50,
        ),
        Accompaniment(
            nameRes = R.string.mixed_berries,
            descRes = R.string.mixed_berries_desc,
            price = 1.00,
        ),
        Accompaniment(
            nameRes = R.string.pickled_veggies,
            descRes = R.string.pickled_veggies_desc,
            price = 0.50,
        )
    )
}