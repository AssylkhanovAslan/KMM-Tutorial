package com.example.kmmtutorial.data.repositories

import com.example.kmmtutorial.BASE_URL
import com.example.kmmtutorial.domain.models.User
import com.example.kmmtutorial.domain.repositories.UserRepository
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class UserRepositoryImpl(private val httpClient: HttpClient) : UserRepository {
    override suspend fun getUser(userId: Int): User {
        return httpClient.get("$BASE_URL/users/$userId").body()
    }
}