package com.example.movieapp.data.domain.movie

import com.example.movieapp.data.model.movie.Movie

class UpdateMovieUseCases(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}