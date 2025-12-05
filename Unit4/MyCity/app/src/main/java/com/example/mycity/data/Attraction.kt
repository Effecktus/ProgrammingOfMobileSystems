package com.example.mycity.data

import androidx.annotation.DrawableRes

data class Attraction(
    val id: Int,
    val title: String,
    val location: String,
    val description: String,
    @DrawableRes val imageRes: Int
)

