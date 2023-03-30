package com.example.kmmtutorial.domain.models


@kotlinx.serialization.Serializable
data class Photo(
    val albumId: Int,
    val id: Int,
    val thumbnailUrl: String,
    val title: String,
    val url: String
)