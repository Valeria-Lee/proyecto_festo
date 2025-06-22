package com.example.proyectofesto

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text

@Composable
fun ItemScreen(item: ItemType) {
    Column () {
        Image(
            painter = painterResource(id = item.imgId),
            contentDescription = item.title
        )
        Button( onClick = {} ) {
            Text(
                text = "Diagrama"
            )
        }
        Button( onClick = {} ) {
            Text(
                text = "Datasheet"
            )
        }
    }
}