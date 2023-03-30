package com.example.kmmtutorial.domain.repositories

import com.example.kmmtutorial.domain.models.User

interface UserRepository {
    @Throws(Exception::class)
    suspend fun getUser(userId: Int): User
}