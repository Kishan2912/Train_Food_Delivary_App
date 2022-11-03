package com.example.cupcake.data.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringDef
import androidx.annotation.StringRes

data class Trains(
    @DrawableRes val imageResourceId: Int,
     val name :Int,
     val route :Int
)