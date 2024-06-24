package com.example.moviedatabase.details.presentation

import com.example.moviedatabase.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
