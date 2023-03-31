package com.example.kmmtutorial.domain.interactors

import com.example.kmmtutorial.domain.models.Post
import com.example.kmmtutorial.domain.repositories.PostsRepository

class GetPostsUseCase(private val repository: PostsRepository) {
    suspend operator fun invoke(): List<Post> {
        return repository.getPosts()
    }
}