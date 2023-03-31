package com.example.kmmtutorial.domain.repositories

import com.example.kmmtutorial.domain.models.Comment

interface CommentsRepository {
    @Throws(Exception::class)
    suspend fun getPostComments(postId: Long): List<Comment>
}