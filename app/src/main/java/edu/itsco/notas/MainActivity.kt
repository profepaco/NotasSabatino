package edu.itsco.notas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.itsco.notas.ui.navigation.SetupNavGraph
import edu.itsco.notas.ui.screens.HomeScreen
import edu.itsco.notas.ui.theme.NotasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotasTheme {
                //HomeScreen(navController = navController)
                //AddNotaScreen()
                val navController: NavHostController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp)
    ){
        Text(text = "Hello $name!",
            modifier = Modifier.padding(vertical = 4.dp),
            style = MaterialTheme.typography.h5
        )
        Text(text = "Con la banda de Sabatino 803-SA")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NotasTheme {
        Greeting("Android")
    }
}