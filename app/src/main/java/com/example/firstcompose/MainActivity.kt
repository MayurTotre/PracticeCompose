package com.example.firstcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            previewFunction()
        }
    }
}


//@OptIn(ExperimentalMaterial3Api::class)
//@Preview(name = "sayMyName", showSystemUi = true)
//@Composable
//fun sayMyName() {
//    val context = LocalContext.current
////    Text(
////        text = "Hello $name",
////        fontStyle = FontStyle.Italic,
////        fontWeight = FontWeight.Bold,
////        color = Color.Red,
////        fontSize = 36.sp)
//
////    Image(
////        painter = painterResource(id = R.drawable.img),
////        contentDescription = "Dummy Image",
////        contentScale = ContentScale.Fit
////    )
//
////    Column(
////        modifier = Modifier.fillMaxSize(),
////        verticalArrangement = Arrangement.Center,
////        horizontalAlignment = Alignment.CenterHorizontally
////    ) {
//
////        Button(onClick = {
////            Toast.makeText(context, "btn Clicked!", Toast.LENGTH_SHORT).show()
////        }) {
////            Text(text = "Hello")
//////        Image(
//////            painter = painterResource(id = R.drawable.img),
//////            contentDescription = "Dummy"
//////        )
////        }
//
//    val state = remember {  mutableStateOf("")}
//    TextField(
//            value = state.value,
//            onValueChange = {
//                state.value = it
//            },
//            label = { Text(text = "Enter Name") },
//            placeholder = {}
//        )
//
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun previewFunction() {
//    Row {
//        Text(text = "A", fontSize = 24.sp)
//        Text(text = "B", fontSize = 24.sp)
//    }
    listViewItems(R.drawable.img, "Mayur", "Android Developer")
}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun listViewItems(imgId: Int, name: String, occupation: String){
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column {
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Light
            )
        }
    }
}