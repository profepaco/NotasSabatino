package edu.itsco.notas.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.itsco.notas.ui.theme.NotasTheme

@Composable
fun HomeScreen(listaNotas: List<String> = List(100){"Nota $it"}){
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("Notas")
            })
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text("Agregar Nota") },
                onClick = { /*TODO*/ }
            )
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {
        LazyColumn(modifier = Modifier.padding(it)){
            items(listaNotas){ titulo ->
                CardNota(titulo)
            }
        }
    }
}

@Composable
fun CardNota(titulo:String = "Mi nota"){
    Card(
        elevation = 2.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 4.dp)
    ) {
        Row(modifier = Modifier.padding(8.dp)) {
            Column(
                modifier =  Modifier.weight(1f)
            ) {
                Text(
                    text = titulo,
                    style = MaterialTheme.typography.h5
                )
                Text(text = "01/Abril/2023")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Detalle")
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CardNotaPreview(){
    NotasTheme() {
        CardNota()
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    NotasTheme {
        HomeScreen()
    }
}