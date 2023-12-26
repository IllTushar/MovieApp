package com.example.movieapp.data.domain.movie.repository

import com.example.movieapp.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}