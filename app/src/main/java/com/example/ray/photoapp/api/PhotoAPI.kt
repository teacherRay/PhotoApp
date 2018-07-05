package com.example.ray.photoapp.api

import com.example.ray.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {
    @GET("?key=9468814-0b540976fd589b7d71b1c0879&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}
