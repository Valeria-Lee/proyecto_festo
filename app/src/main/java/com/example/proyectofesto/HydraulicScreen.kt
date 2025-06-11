package com.example.proyectofesto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HydraulicScreen(goBackHome: () -> Unit) {
    Column(
        Modifier.fillMaxSize()
            .padding(40.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Hidráulica",
            fontSize = 20.sp
        )
        Button(onClick = { goBackHome() }) {
            Text(text = "Regresar a casa")
        }
        LazyColumn(
            contentPadding = PaddingValues(16.dp)
        ) {

        }
    }
}