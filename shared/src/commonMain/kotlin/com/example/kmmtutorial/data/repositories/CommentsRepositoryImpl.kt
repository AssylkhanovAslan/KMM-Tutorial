package com.example.kmmtutorial.data.repositories

import com.example.kmmtutorial.BASE_URL
import com.example.kmmtutorial.domain.models.Comment
import com.example.kmmtutorial.domain.repositories.CommentsRepository
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class CommentsRepositoryImpl(private val httpClient: HttpClient) : CommentsRepository {
    override suspend fun getPostComments(postId: Long): List<Comment> {
        return httpClient.get("$BASE_URL/posts/$postId/comments").body()
    }
}