package com.example.kmmtutorial.android.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun AppTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalCustomColors provides getColors(isDark),
        LocalCustomTypography provides getTypography(isDark),
    ) {
        MaterialTheme(
            content = content,
            colors = if (isDark)
                lightColors(primary = AppTheme.colors.brand01)
            else
                lightColors(primary = AppTheme.colors.brand01)
        )
    }
}

object AppTheme {
    val colors: CustomColors
        @Composable
        get() = LocalCustomColors.current
    val typography: CustomTypography
        @Composable
        get() = LocalCustomTypography.current
}