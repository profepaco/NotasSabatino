package edu.itsco.notas.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.itsco.notas.ui.navigation.Screen
import edu.itsco.notas.ui.theme.NotasTheme

@Composable
fun AddNotaScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(
            title =  { Text(text = "Nueva tarea") },
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(
                        route = Screen.HomeScreen.url
                    )
                }){
                   Icon(
                       imageVector = Icons.Filled.ArrowBack,
                       contentDescription = "Regresar"
                   )
                }
            }
        ) 
    }
    ) {
        Column(modifier = Modifier.padding(it)) {
            FormNota(navController = navController)
        }
    }
}

@Composable
fun FormNota(navController: NavHostController) {
    var titulo by remember { mutableStateOf("") }
    var detalle by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(all = 8.dp)) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = titulo ,
            onValueChange = {
                titulo = it
            },
            label = { Text(text = "Titulo")},
            singleLine = true
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = detalle ,
            onValueChange = { detalle = it },
            label = { Text(text = "Detalle")},
            singleLine = false
        )
        Button(onClick = {
            navController.navigate(route = Screen.HomeScreen.url)
        }) {
            Text(text = "Guardar nota")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AddTareaScreenPreview(){
    NotasTheme {
        AddNotaScreen(navController = rememberNavController())
    }
}