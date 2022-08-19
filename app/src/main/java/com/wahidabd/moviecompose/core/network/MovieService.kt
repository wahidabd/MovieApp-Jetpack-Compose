package com.wahidabd.moviecompose.core.network

import com.wahidabd.moviecompose.core.data.CreditResponse
import com.wahidabd.moviecompose.core.data.Movie
import com.wahidabd.moviecompose.core.data.PagedResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("trending/{media_type}/{time_window}")
    suspend fun trendingMovies(
        @Path("media_type") mediaType: String,
        @Path("time_window") timeWindow: String
    ): Response<PagedResponse<Movie?>>

    @GET("search/multi")
    suspend fun search(
        @Query("query") query: String,
        @Query("page") page: Int
    ): Response<PagedResponse<Movie?>>

    @GET("{media_type}/{id}/credits")
    suspend fun credits(
        @Path("media_type") mediaType: String,
        @Path("id") id: Int
    ): Response<CreditResponse>
}
