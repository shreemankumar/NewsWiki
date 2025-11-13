package com.example.newswiki.ui.news_screen

import com.example.newswiki.domain.model.Article

sealed class NewsScreenEvent {

    data class OnNewsCardClicked(val article: Article): NewsScreenEvent()
    data class OnCategoryChanged(val category: String): NewsScreenEvent()
    data class OnSearchQueryChanged(val searchQuery : String): NewsScreenEvent()

    object OnSearchIconClicked : NewsScreenEvent()
    object OnCloseIconClicked: NewsScreenEvent()

}