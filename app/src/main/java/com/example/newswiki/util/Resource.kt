package com.example.newswiki.util
// it can be any type so type <T> is written with their default value like data with null
// resources class have two subclass 1-success 2-Error
sealed class Resource<T>(val data: T? = null, val message: String? = null){
    class Success<T>(data: T?):Resource<T>(data = data)
    class Error<T>(message: String?):Resource<T>(message = message)
}