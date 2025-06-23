package com.example.proyectofesto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectofesto.ui.theme.ProyectoFestoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoFestoTheme {
                Surface {
                    NavWrapper()
                }
            }
        }
    }
}

@Composable
fun NavWrapper() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Home) {
        composable<Home>{
            Home(navController)
        }
        composable<Pneumatics>{
            PneumaticScreen(navController)
        }
        composable<Hydraulic>{
            HydraulicScreen(navController)
        }
        composable<ItemScreen> {
            ItemScreen(navController)
        }
    }
}

@Composable
fun Home(navController: NavController) {
    Column(
        Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
    ) {
        Row (
            Modifier
                .fillMaxWidth()
                .height(120.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_uacam),
                contentDescription = "Logo de la Universidad Autonóma de Campeche",
                Modifier.fillMaxHeight()
            )
            Text(
                text = "FESTO",
                fontSize = 96.sp
            )
            Image(
                painter = painterResource(id = R.drawable.logo_fdi_uacam),
                contentDescription = "Logo de la facultad de ingenieria de la Universidad Autonóma de Campeche",
                Modifier.fillMaxHeight()
            )
        }
        Spacer(Modifier.size(20.dp))
        FilledTonalButton(onClick = {
            navController.navigate(route = Pneumatics)
        }) {
            Text(
                text = "Neumática",
                fontSize = 36.sp)
        }
        FilledTonalButton(onClick = {
            navController.navigate(route = Hydraulic)
        }) {
            Text(
                text = "Hidráulica",
                fontSize = 36.sp)
        }
    }
}

@Composable
fun selectButton() {
    // Aqui va a ir la estructura de los botones.
}