package com.example.worldcup2022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import com.example.worldcup2022.presentation.screen.HomeScreen
import com.example.worldcup2022.presentation.ui.theme.WorldCup2022Theme
import com.example.worldcup2022.presentation.viewmodel.WorldCupViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldCup2022Theme {
                Column {
                    TopAppBar(
                        title = {
                            Text(text = "World Cup 2022")
                        },
                        backgroundColor = Color.White,
                        contentColor = Color.Black
                    )
                    HomeScreen()
                }
            }
        }
    }
}
