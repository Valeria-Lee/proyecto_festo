package com.example.proyectofesto

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.navigation.NavController

@Composable
fun ItemList(insertedItems: List<ItemType>, navController: NavController) {
    LazyColumn () {
        items(insertedItems) {
            insertedItem -> ItemComponent(insertedItem, navController)
        }
    }
}

fun getSelectedItem(insertedItems: List<ItemType>) {

}