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

var PneumaticItems: List<ItemType> = listOf(
    ItemType("Valvula neumatica 3/2 vias con accionamiento de rodillo normalmente abierta", R.drawable.valvula_neumatica_abierta),
    ItemType("Valvula neumatica 3/2 vias con accionamiento de rodillo normalmente cerrada", R.drawable.logo_uacam),
    ItemType("MODELO #1", R.drawable.logo_uacam),
    ItemType("MODELO #2", R.drawable.logo_uacam),
    ItemType("MODELO #3", R.drawable.logo_uacam),
    ItemType("MODELO #4", R.drawable.logo_uacam),
    ItemType("MODELO #5", R.drawable.logo_uacam),
    ItemType("MODELO #6", R.drawable.logo_uacam),
    ItemType("MODELO #7", R.drawable.logo_uacam),
    ItemType("MODELO #8", R.drawable.logo_uacam),
    ItemType("MODELO #9", R.drawable.logo_uacam),
    ItemType("MODELO #10", R.drawable.logo_uacam),
    ItemType("MODELO #11", R.drawable.logo_uacam),
    ItemType("MODELO #12", R.drawable.logo_uacam),
    ItemType("MODELO #13", R.drawable.logo_uacam),
)

@Composable
fun PneumaticScreen(goBackHome: () -> Unit) {
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
                text = "Neumática",
                fontSize = 40.sp
            )
            Button(onClick = { goBackHome() }) {
                Text(text = "Regresar a casa",
                    fontSize = 24.sp)
            }
        }
        ItemList(PneumaticItems)
    }
}