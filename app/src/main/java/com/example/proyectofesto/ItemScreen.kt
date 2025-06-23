package com.example.proyectofesto

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.navigation.NavController

@Composable
fun ItemScreen(navController: NavController, item: ItemType) {
    Column () {
        Image(
            painter = painterResource(id = item.imgId),
            contentDescription = item.title
        )
        // pintar encima la imagen
        Button( onClick = {} ) {
            Text(
                text = "Diagrama"
            )
        }
        // pintar encima un pdf viewer
        Button( onClick = {} ) {
            Text(
                text = "Datasheet"
            )
        }
    }
}