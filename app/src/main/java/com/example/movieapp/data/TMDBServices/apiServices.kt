package com.example.movieapp.data.TMDBServices

import com.example.movieapp.data.model.movie.MovieList
import com.example.movieapp.data.model.people.PeopleList
import com.example.movieapp.data.model.tv.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface apiServices {

    @GET("trending/movie/{time_window}")
    suspend fun getTrendingMovies(
        @Path("time_window") timeWindow: String,
        @Query("api_key") apiKey: String
    ): Response<MovieList>

    @GET("trending/tv/{time_window}")
    suspend fun getTrendingTvShow(
        @Path("time_window") timeWindow: String,
        @Query("api_key") apiKey: String
    ): Response<TvShowList>

    @GET("trending/person/{time_window}")
    suspend fun getTrendingPeople(
        @Path("time_window") timeWindow: String,
        @Query("api_key") apiKey: String
    ): Response<PeopleList>

}