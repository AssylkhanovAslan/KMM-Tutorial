package com.example.kmmtutorial.di.modules

import com.example.kmmtutorial.data.repositories.CommentsRepositoryImpl
import com.example.kmmtutorial.data.repositories.PostsRepositoryImpl
import com.example.kmmtutorial.data.repositories.UserRepositoryImpl
import com.example.kmmtutorial.domain.repositories.CommentsRepository
import com.example.kmmtutorial.domain.repositories.PostsRepository
import com.example.kmmtutorial.domain.repositories.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<PostsRepository> { PostsRepositoryImpl(get()) }
    factory<CommentsRepository> { CommentsRepositoryImpl(get()) }
    factory<UserRepository> { UserRepositoryImpl(get()) }
}