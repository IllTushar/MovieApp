package com.example.movieapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movieapp.data.model.movie.Movie
import com.example.movieapp.data.model.people.People
import com.example.movieapp.data.model.tv.TvShow

@Database(
    entities = [Movie::class, People::class, TvShow::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MoiveDaoInterface
    abstract fun tvDao():TvShowDaoInterface
    abstract fun peopleDao():PeopleDaoInterfaces
}