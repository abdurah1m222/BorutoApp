package com.example.borutoapp.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xffd8d8d8)
val DarkGray = Color(0xff2a2a2a)

val Colors.welcomeScreenBackgroundColor
    @Composable
    get() = if (isLight) Color.White else Color.Black

val Colors.titleColor
    @Composable
    get() = if (isLight) DarkGray else LightGray

val Colors.descriptionColor
    @Composable
    get() = if (isLight) DarkGray.copy(alpha = 0.4f)
    else LightGray.copy(alpha = 0.4f)

val Colors.activeIndicatorColor
    @Composable
    get() = if (isLight) Purple500 else Purple700

val Colors.inActiveIndicatorColor
    @Composable
    get() = if (isLight) LightGray else DarkGray

val Colors.buttonBackgroundColor
    @Composable
    get() = if (isLight) Purple500 else Purple700