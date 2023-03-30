package com.example.kmmtutorial.data.repositories

import com.example.kmmtutorial.BASE_URL
import com.example.kmmtutorial.domain.models.Post
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class PostsRepositoryImpl(private val httpClient: HttpClient) : com.example.kmmtutorial.domain.repositories.PostsRepository {
    override suspend fun getPosts(): List<Post> {
        return httpClient.get("$BASE_URL/posts").body()
    }

    override suspend fun getPostDetails(postId: Long): Post {
        return httpClient.get("$BASE_URL/posts/$postId").body()
    }
}