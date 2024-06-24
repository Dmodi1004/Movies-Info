package com.example.moviedatabase.movieList.domain.repository

import com.example.moviedatabase.movieList.domain.model.Movie
import com.example.moviedatabase.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {

    suspend fun getMovieList(
        forceFetchFormRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>

}