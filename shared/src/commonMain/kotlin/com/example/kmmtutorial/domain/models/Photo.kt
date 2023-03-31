package com.example.kmmtutorial.domain.models


@kotlinx.serialization.Serializable
data class Photo(
    val albumId: Long,
    val id: Long,
    val thumbnailUrl: String,
    val title: String,
    val url: String
)