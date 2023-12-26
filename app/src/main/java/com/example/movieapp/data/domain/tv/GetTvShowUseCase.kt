package com.example.movieapp.data.domain.tv

import com.example.movieapp.data.model.tv.TvShow

class GetTvShowUseCase(private val tvShowRepository:TvShowRepository) {
    suspend fun execute():List<TvShow>?= tvShowRepository.getTvShow()
}