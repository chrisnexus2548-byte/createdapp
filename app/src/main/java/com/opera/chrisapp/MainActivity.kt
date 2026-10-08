package com.opera.chrisapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.opera.firstapp.navigation.AppNavHost
import com.opera.chrisapp.ui.theme.ChrisappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChrisappTheme {
                AppNavHost()
            }
        }
    }
}
