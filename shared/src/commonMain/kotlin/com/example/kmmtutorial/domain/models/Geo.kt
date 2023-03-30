package com.example.kmmtutorial.domain.models


@kotlinx.serialization.Serializable
data class Geo(
    val lat: String,
    val lng: String
)