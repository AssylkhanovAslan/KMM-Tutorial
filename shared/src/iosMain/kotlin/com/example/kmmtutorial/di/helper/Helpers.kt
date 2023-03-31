package com.example.kmmtutorial.di.helper

import com.example.kmmtutorial.domain.interactors.GetCommentsUseCase
import com.example.kmmtutorial.domain.interactors.GetPostDetailsUseCase
import com.example.kmmtutorial.domain.interactors.GetPostsUseCase
import com.example.kmmtutorial.domain.interactors.GetUserUseCase
import com.example.kmmtutorial.domain.models.Comment
import com.example.kmmtutorial.domain.models.Post
import com.example.kmmtutorial.domain.models.User
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetPostsHelper : KoinComponent {
    private val useCase : GetPostsUseCase by inject()
    suspend fun get(): List<Post> = useCase()
}

class GetPostDetailsHelper : KoinComponent {
    private val useCase : GetPostDetailsUseCase by inject()
    suspend fun get(postId: Long): Post = useCase(postId)
}

class GetPostCommentsHelper : KoinComponent {
    private val useCase : GetCommentsUseCase by inject()
    suspend fun get(postId: Long): List<Comment> = useCase(postId)
}

class GetUserUseCase : KoinComponent {
    private val useCase : GetUserUseCase by inject()
    suspend fun get(userId: Long): User = useCase(userId)
}