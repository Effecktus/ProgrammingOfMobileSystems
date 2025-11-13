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

// Список всех 30 цветов
val flowers = listOf(
    Flower(1, R.drawable.flower_1, R.string.flower_1_name, R.string.flower_1_meaning),
    Flower(2, R.drawable.flower_2, R.string.flower_2_name, R.string.flower_2_meaning),
    Flower(3, R.drawable.flower_3, R.string.flower_3_name, R.string.flower_3_meaning),
    Flower(4, R.drawable.flower_4, R.string.flower_4_name, R.string.flower_4_meaning),
    Flower(5, R.drawable.flower_5, R.string.flower_5_name, R.string.flower_5_meaning),
    Flower(6, R.drawable.flower_6, R.string.flower_6_name, R.string.flower_6_meaning),
    Flower(7, R.drawable.flower_7, R.string.flower_7_name, R.string.flower_7_meaning),
    Flower(8, R.drawable.flower_8, R.string.flower_8_name, R.string.flower_8_meaning),
    Flower(9, R.drawable.flower_9, R.string.flower_9_name, R.string.flower_9_meaning),
    Flower(10, R.drawable.flower_10, R.string.flower_10_name, R.string.flower_10_meaning),
    Flower(11, R.drawable.flower_11, R.string.flower_11_name, R.string.flower_11_meaning),
    Flower(12, R.drawable.flower_12, R.string.flower_12_name, R.string.flower_12_meaning),
    Flower(13, R.drawable.flower_13, R.string.flower_13_name, R.string.flower_13_meaning),
    Flower(14, R.drawable.flower_14, R.string.flower_14_name, R.string.flower_14_meaning),
    Flower(15, R.drawable.flower_15, R.string.flower_15_name, R.string.flower_15_meaning),
    Flower(16, R.drawable.flower_16, R.string.flower_16_name, R.string.flower_16_meaning),
    Flower(17, R.drawable.flower_17, R.string.flower_17_name, R.string.flower_17_meaning),
    Flower(18, R.drawable.flower_18, R.string.flower_18_name, R.string.flower_18_meaning),
    Flower(19, R.drawable.flower_19, R.string.flower_19_name, R.string.flower_19_meaning),
    Flower(20, R.drawable.flower_20, R.string.flower_20_name, R.string.flower_20_meaning),
    Flower(21, R.drawable.flower_21, R.string.flower_21_name, R.string.flower_21_meaning),
    Flower(22, R.drawable.flower_22, R.string.flower_22_name, R.string.flower_22_meaning),
    Flower(23, R.drawable.flower_23, R.string.flower_23_name, R.string.flower_23_meaning),
    Flower(24, R.drawable.flower_24, R.string.flower_24_name, R.string.flower_24_meaning),
    Flower(25, R.drawable.flower_25, R.string.flower_25_name, R.string.flower_25_meaning),
    Flower(26, R.drawable.flower_26, R.string.flower_26_name, R.string.flower_26_meaning),
    Flower(27, R.drawable.flower_27, R.string.flower_27_name, R.string.flower_27_meaning),
    Flower(28, R.drawable.flower_28, R.string.flower_28_name, R.string.flower_28_meaning),
    Flower(29, R.drawable.flower_29, R.string.flower_29_name, R.string.flower_29_meaning),
    Flower(30, R.drawable.flower_30, R.string.flower_30_name, R.string.flower_30_meaning)
)

