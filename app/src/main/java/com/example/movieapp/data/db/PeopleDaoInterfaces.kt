package com.example.movieapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.movieapp.data.model.people.People

@Dao
interface PeopleDaoInterfaces {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePeople(people: List<People>)

    @Query("DELETE FROM popular_people")
    suspend fun deletePeople()

    @Query("select * FROM popular_people")
    suspend fun getPeople(people: List<People>)
}