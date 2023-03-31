package com.example.kmmtutorial.domain.interactors

import com.example.kmmtutorial.domain.models.User
import com.example.kmmtutorial.domain.repositories.UserRepository

class GetUserUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(userId: Long): User {
        return repository.getUser(userId)
    }
}