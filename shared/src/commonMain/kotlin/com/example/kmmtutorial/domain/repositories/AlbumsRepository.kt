package com.example.kmmtutorial.domain.repositories

import com.example.kmmtutorial.domain.models.Album

interface AlbumsRepository {
    @Throws(Exception::class)
    suspend fun getAlbums() : List<Album>
}