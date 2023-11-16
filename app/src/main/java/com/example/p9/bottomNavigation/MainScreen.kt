package com.example.p9.bottomNavigation

import android.annotation.SuppressLint
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val controller = rememberNavController()
    Scaffold(bottomBar = { BottomNavigation(navController = controller) }) {
        NavGraph(navHostController = controller)
    }
}