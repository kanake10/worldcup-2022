package com.example.worldcup2022.presentation.nav

sealed class NavItem(val route: String) {
    object Countries: NavItem("Teams")
}
