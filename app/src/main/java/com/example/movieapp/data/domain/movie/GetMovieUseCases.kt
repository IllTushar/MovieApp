package com.example.movieapp.data.domain.movie

import com.example.movieapp.data.model.movie.Movie

class GetMovieUseCases(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? =movieRepository.getMovies()

}