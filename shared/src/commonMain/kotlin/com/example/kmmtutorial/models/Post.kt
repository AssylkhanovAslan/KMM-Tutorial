package com.example.kmmtutorial.models

import kotlinx.serialization.Serializable


@Serializable
data class Post(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)