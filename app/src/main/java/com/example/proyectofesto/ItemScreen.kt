package com.example.proyectofesto

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog



@Composable
fun ItemScreen(goItemList:() -> Unit) {
    val item = SelectedItem.item
    var mostrarDiagrama = false

    if (item != null) {
        Column() {
            Image(
                painter = painterResource(id = item.imgId),
                contentDescription = item.title
            )
            // pintar encima la imagen
            // por ende necesito capas
            Button(onClick = {
                mostrarDiagrama = true
            }) {
                Text(
                    text = "Diagrama"
                )
            }
            // pintar encima un pdf viewer
            Button(onClick = {}) {
                Text(
                    text = "Datasheet"
                )
            }
            Button(onClick = {goItemList()}) {
                Text(
                    text = "Seleccionar otro modelo"
                )
            }
        }
    } else {
        Text(text = "Item inválido")
    }
}

/* Abrir diagrama en proceso...
@Composable
fun diagramDialog(item: ItemType) {
Dialog(onDismissRequest = { onDismissRequest() }) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(375.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
    ) {
        Image(
            painter = painterResource(id = item.diagramImgId),
            contentDescription = "Diagrama de " + item.diagramImgId
        )
        TextButton(onClick = { onDismissRequest() }) {
            Text("Cerrar")
        }
    }
}*/