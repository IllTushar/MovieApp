package com.example.movieapp.data.domain.people.usecase

import com.example.movieapp.data.domain.people.repository.PeopleRepository
import com.example.movieapp.data.model.people.People

class updatePeople(private val people: PeopleRepository) {
    suspend fun updatePeople():List<People>?=people.updatePeople()
}