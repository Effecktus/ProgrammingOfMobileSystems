package model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.app30days.R

data class Flower(
    val number: Int,
    @DrawableRes
    val imageId: Int,
    @StringRes
    val nameId: Int,
    @StringRes
    val meaningId: Int
)

val flowers = listOf(
    Flower(1, R.drawable.flower_1, R.string.flower_1_name, R.string.flower_1_meaning)
)

