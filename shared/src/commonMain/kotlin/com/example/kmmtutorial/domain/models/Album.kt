package com.example.kmmtutorial.domain.models


@kotlinx.serialization.Serializable
data class Album(
    val id: Long,
    var previewPhoto: String,
    val title: String,
    val userId: Long,
    var username: String,
)