package com.example.kmmtutorial.domain.models


@kotlinx.serialization.Serializable
data class Address(
    val city: String,
    val geo: Geo,
    val street: String,
    val suite: String,
    val zipcode: String
)