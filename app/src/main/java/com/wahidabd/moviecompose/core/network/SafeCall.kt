package com.wahidabd.moviecompose.core.network

import com.google.gson.JsonSyntaxException
import org.json.JSONObject
import retrofit2.Response
import java.io.IOException

var isConnectedToNetwork = true

suspend fun <T: Any> enqueue(
    call: suspend () -> Response<T>,
    errorMessage: String? = "Problem Fetching data at the moment!"
): ResponseApi<T> {
    try {
        val response = call()
        if (response.isSuccessful){
            isConnectedToNetwork = true
            response.body()?.let {
                return Success(it)
            }
        }

        response.errorBody()?.let {
            return try {
                val errorString = it.string()
                val errorObject = JSONObject(errorMessage)
                Failure((errorObject.getString("status_message") ?: errorMessage))
            }catch (ignore: JsonSyntaxException){
                Failure(ignore.message)
            }
        }
        return Failure(errorMessage)
    }catch (e: Exception){
        if (e is IOException){
            isConnectedToNetwork = false
        }
        return Failure(e.message ?: errorMessage)
    }
}