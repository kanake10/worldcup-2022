package com.example.worldcup2022

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.worldcup2022.presentation.nav.NavItem
import com.example.worldcup2022.presentation.screen.HomeScreen
import com.example.worldcup2022.presentation.ui.theme.WorldCup2022Theme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldCup2022Theme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = NavItem.Countries.route
                    ) {
                        composable(
                            route = NavItem.Countries.route
                        ) {
                            HomeScreen()
                        }
                    }
                }
            }
        }
    }
}