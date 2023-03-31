package com.example.kmmtutorial.android

import android.app.Application
import com.example.kmmtutorial.di.modules.useCaseModule
import com.example.kmmtutorial.di.modules.networkModule
import com.example.kmmtutorial.di.modules.repositoryModule
import org.koin.core.context.startKoin
import timber.log.Timber

class PlaceholderApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initLogger()
        initKoin()
    }

    private fun initLogger() {
        Timber.plant(Timber.DebugTree())
    }

    private fun initKoin() {
        startKoin {
            modules(networkModule, repositoryModule, useCaseModule)
        }
    }

}