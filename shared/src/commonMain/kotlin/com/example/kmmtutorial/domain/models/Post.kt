package com.example.kmmtutorial.domain.models

import kotlinx.serialization.Serializable


@Serializable
data class Post(
    val body: String,
    val id: Long,
    val title: String,
    val userId: Long
)