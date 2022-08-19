package com.wahidabd.moviecompose.core.network

sealed class ResponseApi <out T: Any?>
data class Success<out T : Any?>(val data: T) : ResponseApi<T>()
data class Failure(val error: String?) : ResponseApi<Nothing>()
