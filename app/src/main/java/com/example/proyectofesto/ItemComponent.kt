package com.example.proyectofesto

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

// Componente de item que forma parte de las listas
@Composable
fun ItemComponent(dataItem: ItemType, navController: NavController) {
    Row(
        Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
                painter = painterResource(id = dataItem.imgId),
                contentDescription = dataItem.title,

                Modifier.width(240.dp)
                    .border(
                        BorderStroke(8.dp, Color.Yellow), // TODO: Cambiar el color del borde
                        RectangleShape
                    )
                    .clickable {
                        SelectedItem.item = dataItem
                        navController.navigate(route = ItemScreen)
                    }
            )
        Text(
            text = dataItem.title,
            fontSize = 20.sp,
            modifier = Modifier.width(280.dp)
        )
    }
}