package com.example.kmmtutorial.domain.models


@kotlinx.serialization.Serializable
data class Album(
    val id: Int,
    var previewPhoto: String,
    val title: String,
    val userId: Int,
    var username: String,
)