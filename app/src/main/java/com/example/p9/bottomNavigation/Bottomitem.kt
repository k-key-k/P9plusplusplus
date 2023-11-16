package com.example.p9.bottomNavigation

import com.example.p9.R

sealed class Bottomitem(val title: String, val iconId: Int, val route: String){
    object Screen1: Bottomitem("Screen1", R.drawable.icon, "screen_1")
    object Screen2: Bottomitem("Screen2", R.drawable.icon, "screen_2")
    object Screen3: Bottomitem("Screen3", R.drawable.icon, "screen_3")
    object Screen4: Bottomitem("Screen4", R.drawable.icon, "screen_4")
}