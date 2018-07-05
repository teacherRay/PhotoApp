package com.example.ray.photoapp.api

import com.example.ray.photoapp.models.PhotoList
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.view.*
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PhotoRetriever {
    private val service: PhotoAPI

    init{
        val retrofit = Retrofit.Builder().
                baseUrl("https://pixabay.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service = retrofit.create(PhotoAPI:: class.java)
    }

    fun getPhotos(callback: Callback<PhotoList>){
        val call = service.getPhotos()
        call.enqueue(callback)
    }
}
