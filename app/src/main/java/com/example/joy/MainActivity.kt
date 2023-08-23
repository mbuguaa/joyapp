package com.example.joy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.joy.ui.theme.JoyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           demo()
        }
    }
}

@Composable
fun demo(){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        Text(text = "Hello Joy", color = Color.Blue, fontSize = 20.sp, fontFamily = FontFamily.Cursive)
        Text(text = "Welcome to Android", color = Color.Gray, fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Kotlin", color = Color.Magenta, fontSize = 15.sp, fontFamily = FontFamily.Monospace)
        Text(text = "Jetpack compose",
            color = Color.Cyan,
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif)
        Divider()
        Spacer(modifier = Modifier.height(30.dp))
        Row {
            Text(text = "Text1",
                fontSize = 30.sp)
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "Text2",
                fontSize = 30.sp)
        }
        Row {
            Text(text = "eMobilis",
                fontSize = 30.sp)
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "Technology",
                fontSize = 30.sp)
        }
        Box {
            Text(text = "Yes",
                fontSize = 30.sp)
            Text(text = "No",
                fontSize = 30.sp)
        }
        Button(onClick = { /*TODO*/ },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Red)) {
            Text(text = "Click Me")

        }
        Button(onClick = { /*TODO*/ },
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)  ) {

            Image(painter = painterResource(id = R.drawable.img_3), contentDescription ="ICON" )
            Text(text = "Add to cart",
                modifier = Modifier
                    .padding(start = 10.dp))
        }
        //Bordered button
        Button(onClick = { /*TODO*/ },
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.Red),
            colors = ButtonDefaults.outlinedButtonColors()
        ) {
            Text(text = "Bordered button")
            
        }
    }
    


}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()
}

