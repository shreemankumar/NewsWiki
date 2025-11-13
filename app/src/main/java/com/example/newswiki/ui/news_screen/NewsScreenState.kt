package com.example.newswiki.ui.news_screen

import com.example.newswiki.domain.model.Article
import retrofit2.http.Query
import java.util.Locale.Category

data class NewsScreenState(
    val isLoading : Boolean = false,
    val articles : List<Article> = emptyList(),
    val error : String? = null,
    val isSearchBarVisible : Boolean = false,
    val SelectedArticle : Article? = null,
    val category: String = "General",
    val searchQuery: String = ""
)
