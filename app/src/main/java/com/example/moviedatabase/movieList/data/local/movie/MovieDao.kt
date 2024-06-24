package com.example.moviedatabase.movieList.data.local.movie

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface MovieDao {

    @Upsert
    suspend fun upsertMovieList(movieList: List<MovieEntity>)

    @Query("select * from movieentity where id = :id")
    suspend fun getMovieById(id: Int): MovieEntity

    @Query("select * from movieentity where category = :category")
    suspend fun getMovieListByCategory(category: String): List<MovieEntity>

}