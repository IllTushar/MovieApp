package com.example.movieapp.data.domain.people

import com.example.movieapp.data.model.people.People

class GetAllPeople(private val people: PeopleRepository) {
    suspend fun people():List<People>? = people.getPeople()
}