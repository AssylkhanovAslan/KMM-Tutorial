package com.example.kmmtutorial.domain.models


@kotlinx.serialization.Serializable
data class Company(
    val bs: String,
    val catchPhrase: String,
    val name: String
)