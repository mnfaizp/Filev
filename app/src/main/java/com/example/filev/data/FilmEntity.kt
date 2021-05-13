package com.example.filev.data

data class FilmEntity(
    var filmId: String,
    var title: String,
    var releasedDate: String,
    var desctiption: String,
    var imagePath: Int,
    var isTvShow: Boolean = false,
    var rate: String,
    var reviewRating: Int
)
