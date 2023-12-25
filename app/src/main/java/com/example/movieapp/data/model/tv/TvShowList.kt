package com.example.movieapp.data.model.tv


import com.example.movieapp.data.model.tv.TvShow
import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("results")
    val tvShows: List<TvShow>
)