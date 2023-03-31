package com.example.kmmtutorial.di.modules

import com.example.kmmtutorial.domain.interactors.GetCommentsUseCase
import com.example.kmmtutorial.domain.interactors.GetPostDetailsUseCase
import com.example.kmmtutorial.domain.interactors.GetPostsUseCase
import com.example.kmmtutorial.domain.interactors.GetUserUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory { GetPostsUseCase(get()) }
    factory { GetPostDetailsUseCase(get()) }
    factory { GetCommentsUseCase(get()) }
    factory { GetUserUseCase(get()) }
}