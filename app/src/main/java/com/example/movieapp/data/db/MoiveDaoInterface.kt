package com.example.movieapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.movieapp.data.model.movie.Movie

@Dao
interface MoiveDaoInterface {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovie(movies: List<Movie>)

    @Query("DELETE FROM popular_movies")
    suspend fun deleteMovies()

    @Query("SELECT * FROM popular_movies")
    suspend fun getMovies(movies: List<Movie>)
}