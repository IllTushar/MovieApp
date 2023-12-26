package com.example.movieapp.data.domain.movie.usecase

import com.example.movieapp.data.domain.movie.repository.MovieRepository
import com.example.movieapp.data.model.movie.Movie

class GetMovieUseCases(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? =movieRepository.getMovies()

}