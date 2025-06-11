package com.example.proyectofesto

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun PneumaticScreen(goBackHome: () -> Unit) {
    Column(
        Modifier.fillMaxSize()
    ) {
        Text(
            text = "Neumática",
            fontSize = 32.sp
        )
        Button(onClick = { goBackHome() }) {
            Text(text = "Regresar a casa")
        }
    }
}