package com.example.newswiki.data.remote.reopsitory

import com.example.newswiki.data.remote.NewsApi
import com.example.newswiki.domain.model.Article
import com.example.newswiki.domain.repository.NewsRepository
import com.example.newswiki.util.Resource

class NewsRepositoryImpl(
    private val newsApi : NewsApi
):NewsRepository{

    override suspend fun getTopHeadlines(category: String): Resource<List<Article>> {
       return try {
           val response = newsApi.getBreakingNews(category = category)
           Resource.Success(response.articles)
       }catch (e : Exception){
           Resource.Error(message =  "Failed to fetch news ${e.message}")
       }
    }
}