package com.example.kmmtutorial.di

import com.example.kmmtutorial.di.modules.networkModule
import com.example.kmmtutorial.di.modules.repositoryModule
import com.example.kmmtutorial.di.modules.useCaseModule
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(networkModule, repositoryModule, useCaseModule)
    }
}