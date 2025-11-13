package com.example.newswiki.data.remote

import com.example.newswiki.domain.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    //GET REQUEST
    @GET("top-headlines")
    suspend fun getBreakingNews(
        //Parameters
        @Query("category") category: String,
        @Query("country")country:String = "us",
        @Query("apiKey") apiKey:String = API_KEY
    ):NewsResponse
   companion object{

       //https://newsapi.org/v2/top-headlines?country=us&apiKey=cee9d38f43504c43aa6d0fb6bef92e4f
       const val BASE_URL = "https://newsapi.org/v2/"
       const val API_KEY  = "cee9d38f43504c43aa6d0fb6bef92e4f"
   }
}