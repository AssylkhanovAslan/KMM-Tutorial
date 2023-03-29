package com.example.kmmtutorial

import com.example.kmmtutorial.models.Post
import io.ktor.client.call.*
import io.ktor.client.request.*

class PostsRepository {
    private val dataSource = NetworkModule.getHttpClient()

    @Throws(Exception::class)
    suspend fun getPosts() : List<Post> {
        return dataSource.get("$BASE_URL/posts").body()
    }
}