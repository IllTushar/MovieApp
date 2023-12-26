package com.example.movieapp.data.domain.movie.usecase

import com.example.movieapp.data.domain.movie.repository.MovieRepository
import com.example.movieapp.data.model.movie.Movie

class UpdateMovieUseCases(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}