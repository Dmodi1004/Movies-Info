package com.example.moviedatabase.movieList.data.remote.responde

data class MovieListDto(
    val page: Int,
    val results: List<MovieDto>,
    val total_pages: Int,
    val total_results: Int
)