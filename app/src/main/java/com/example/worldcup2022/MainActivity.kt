package com.example.worldcup2022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.runtime.Composable
import coil.compose.rememberImagePainter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.worldcup2022.presentation.state.DataState
import com.example.worldcup2022.presentation.viewmodel.WorldCupViewModel
import com.example.worldcup2022.models.Countries
import com.example.worldcup2022.presentation.screen.HomeScreen
import com.example.worldcup2022.presentation.screen.ShowCountriesLazyList
import com.example.worldcup2022.presentation.ui.theme.WorldCup2022Theme

class MainActivity : ComponentActivity() {

    private val viewModel: WorldCupViewModel by viewModels()
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
                    HomeScreen(viewModel)
                }
            }
        }
    }
}