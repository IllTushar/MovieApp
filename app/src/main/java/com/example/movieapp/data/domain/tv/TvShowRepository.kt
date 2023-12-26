package com.example.movieapp.data.domain.tv

import com.example.movieapp.data.model.tv.TvShow

interface TvShowRepository {
    suspend fun getTvShow():List<TvShow>?
    suspend fun updateTvShow():List<TvShow>?
}