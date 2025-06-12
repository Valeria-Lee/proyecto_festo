package com.example.proyectofesto

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items

@Composable
fun ItemList(insertedItems: List<ItemType>) {
    LazyColumn () {
        items(insertedItems) {
            insertedItem -> ItemComponent(insertedItem)
        }
    }
}