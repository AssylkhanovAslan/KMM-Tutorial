package com.example.kmmtutorial.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RocketLaunch (
    val flightNumber: Int,
    val missionName: String,
    val launchDateUTC: String,
    val launchSuccess: Boolean?,
)