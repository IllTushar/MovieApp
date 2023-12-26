package com.example.movieapp.data.domain.people.repository

import com.example.movieapp.data.model.people.People

interface PeopleRepository
{
suspend fun getPeople():List<People>?
suspend fun updatePeople():List<People>?
}