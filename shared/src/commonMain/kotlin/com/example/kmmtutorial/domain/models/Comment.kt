package com.example.kmmtutorial.domain.models

@kotlinx.serialization.Serializable
data class Comment(
    val body: String,
    val email: String,
    val id: Long,
    val name: String,
    val postId: Long
)