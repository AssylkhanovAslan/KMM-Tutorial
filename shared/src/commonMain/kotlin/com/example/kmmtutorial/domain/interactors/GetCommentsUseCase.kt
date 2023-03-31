package com.example.kmmtutorial.domain.interactors

import com.example.kmmtutorial.domain.models.Comment
import com.example.kmmtutorial.domain.repositories.CommentsRepository

class GetCommentsUseCase(private val repository: CommentsRepository) {
    suspend operator fun invoke(postId: Long): List<Comment> {
        return repository.getPostComments(postId)
    }
}