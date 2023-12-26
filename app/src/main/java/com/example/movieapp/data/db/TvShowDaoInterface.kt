package com.example.movieapp.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.movieapp.data.model.tv.TvShow

@Dao
interface TvShowDaoInterface {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShow(tv_show:List<TvShow>)

    @Query("select * from popular_tv_show")
    suspend fun getTvShow(tv_show: List<TvShow>)

    @Query("Delete From popular_tv_show")
    suspend fun deleteTvShow()
}