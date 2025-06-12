package com.example.proyectofesto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

var HydraulicItems: List<ItemType> = listOf(
    ItemType("MODELO #1", R.drawable.logo_uacam),
    ItemType("MODELO #2", R.drawable.logo_uacam),
    ItemType("MODELO #3", R.drawable.logo_uacam),
    ItemType("MODELO #4", R.drawable.logo_uacam),
    ItemType("MODELO #1", R.drawable.logo_uacam),
    ItemType("MODELO #2", R.drawable.logo_uacam),
    ItemType("MODELO #3", R.drawable.logo_uacam),
    ItemType("MODELO #4", R.drawable.logo_uacam),
    ItemType("MODELO #1", R.drawable.logo_uacam),
    ItemType("MODELO #2", R.drawable.logo_uacam),
    ItemType("MODELO #3", R.drawable.logo_uacam),
    ItemType("MODELO #4", R.drawable.logo_uacam),
)

@Composable
fun HydraulicScreen(goBackHome: () -> Unit) {

    Column(
        Modifier.fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            Modifier.fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Hidráulica",
                fontSize = 40.sp
            )

            Button(onClick = { goBackHome() }) {
                Text(text = "Regresar a casa",
                    fontSize = 24.sp)
            }
        }
        ItemList(HydraulicItems)
    }
}