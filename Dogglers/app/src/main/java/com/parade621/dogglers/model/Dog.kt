package com.parade621.dogglers.model

import androidx.annotation.DrawableRes

data class Dog(
    @DrawableRes val image: Int,
    val name: String,
    val age: String,
    val hobbies: String
)