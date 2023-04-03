package edu.itsco.notas.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.itsco.notas.ui.theme.NotasTheme

@Composable
fun AddNotaScreen(){
    Scaffold(
        topBar = { TopAppBar(
            title =  { Text(text = "Nueva tarea")}        
        ) 
    }
    ) {
        Column(modifier = Modifier.padding(it)) {
            FormNota()
        }
    }
}

@Composable
fun FormNota(){
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
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Guardar nota")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun FormNotaPreview(){
    NotasTheme {
        FormNota()
    }
}

@Composable
@Preview(showBackground = true)
fun AddTareaScreenPreview(){
    NotasTheme {
        AddNotaScreen()
    }
}