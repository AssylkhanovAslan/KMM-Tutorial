package com.example.kmmtutorial

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class NetworkModule {
    companion object {
        private val httpClient =
            HttpClient {
                install(ContentNegotiation) {
                    json(Json {

                        prettyPrint = true
                        isLenient = true
                        ignoreUnknownKeys = true
                    })
                }
            }

        fun getHttpClient(): HttpClient = httpClient
    }
}