package com.example.kmmtutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform