package com.opera.firstapp.models

import androidx.compose.ui.semantics.Role

data class User(

    val fullname: String ="",
    val email:String ="",
    val password: String="",
    val userId: String="",
    val role: String="user"
)

