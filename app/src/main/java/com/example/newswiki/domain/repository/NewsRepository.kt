package com.example.newswiki.domain.repository

import com.example.newswiki.domain.model.Article
import com.example.newswiki.util.Resource

interface NewsRepository {
    suspend fun getTopHeadlines(
        category: String
    ):Resource<List<Article>>


}