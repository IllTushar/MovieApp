package com.example.movieapp.data.model.people


import com.example.movieapp.data.model.people.People
import com.google.gson.annotations.SerializedName

data class PeopleList(
    @SerializedName("results")
    val people: List<People>
)