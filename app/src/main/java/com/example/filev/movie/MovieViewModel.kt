package com.example.filev.movie

import androidx.lifecycle.ViewModel
import com.example.filev.data.FilmEntity
import com.example.filev.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): List<FilmEntity> {

        val movies = ArrayList<FilmEntity>()

        for (film in DataDummy.generateDummyFilm()) {
            if (!film.isTvShow) {
                movies.add(film)
            }
        }

        return movies
    }

}