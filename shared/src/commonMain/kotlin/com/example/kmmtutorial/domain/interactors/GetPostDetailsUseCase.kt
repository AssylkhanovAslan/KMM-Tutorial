package com.example.kmmtutorial.domain.interactors

import com.example.kmmtutorial.domain.models.Post
import com.example.kmmtutorial.domain.repositories.PostsRepository

class GetPostDetailsUseCase(private val repository: PostsRepository) {
    suspend operator fun invoke(postId: Long): Post {
        return repository.getPostDetails(postId)
    }
}