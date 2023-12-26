package com.example.movieapp.data.domain.people

import com.example.movieapp.data.model.people.People

class updatePeople(private val people: PeopleRepository) {
    suspend fun updatePeople():List<People>?=people.updatePeople()
}