package com.example.movieapp.data.domain.tv.usecase

import com.example.movieapp.data.domain.tv.repository.TvShowRepository
import com.example.movieapp.data.model.tv.TvShow

class GetTvShowUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?= tvShowRepository.getTvShow()
}