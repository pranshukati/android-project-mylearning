package com.example.lunchtrayapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lunchtrayapp.R

@Composable
fun FormattedMenuItem(itemName: String, itemDesc: String, itemPrice: Double) {
    Column(modifier = Modifier
        .padding(dimensionResource(id = R.dimen.padding_small))
    ) {
        Text(
            text = itemName,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = itemDesc,
            style = MaterialTheme.typography.bodySmall
        )
        Text(
            text = stringResource(R.string.item_price, itemPrice),
            style = MaterialTheme.typography.labelSmall
        )
    }
}
@Preview(showBackground = true)
@Composable
fun FormattedMenuItemPreview() {
    FormattedMenuItem(
        itemName = "Cauliflower",
        itemDesc = "Whole cauliflower, brined, roasted, and deep fired",
        itemPrice = 4.00
    )
}