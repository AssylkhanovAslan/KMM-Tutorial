package com.example.kmmtutorial.domain.repositories

import com.example.kmmtutorial.domain.models.Post
import io.ktor.client.call.*
import io.ktor.client.request.*

interface PostsRepository {
    @Throws(Exception::class)
    suspend fun getPosts() : List<Post>

    @Throws(Exception::class)
    suspend fun getPostDetails(postId: Long): Post
}