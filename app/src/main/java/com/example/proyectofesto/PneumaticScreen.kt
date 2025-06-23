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
import androidx.navigation.NavController

var PneumaticItems: List<ItemType> = listOf(
    ItemType("Valvula neumatica 3/2 vias con accionamiento de rodillo normalmente abierta", R.drawable.valvula_neumatica_abierta, R.drawable.valvula_abierta_diagrama),
)

@Composable
fun PneumaticScreen(navController: NavController) {
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
            Button(onClick = {  navController.navigate(route = Home) }) {
                Text(text = "Regresar a casa",
                    fontSize = 24.sp)
            }
        }
        ItemList(PneumaticItems, navController)
    }
}