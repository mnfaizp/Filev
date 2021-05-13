package com.example.filev.detail

import androidx.lifecycle.ViewModel
import com.example.filev.data.FilmEntity
import com.example.filev.utils.DataDummy

class DetailFilmViewModel : ViewModel() {
    private lateinit var filmId: String

    fun setSelectedFilm(filmId: String) {
        this.filmId = filmId
    }

    fun getFilm(): FilmEntity {
        lateinit var film: FilmEntity
        val filmEntities = DataDummy.generateDummyFilm()

        for (filmEntity in filmEntities) {
            if (filmEntity.filmId == this.filmId) {
                film = filmEntity
            }
        }

        return film
    }
}