package com.example.filev.tvshow

import androidx.lifecycle.ViewModel
import com.example.filev.data.FilmEntity
import com.example.filev.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShow(): List<FilmEntity> {

        val tvShow = ArrayList<FilmEntity>()

        for (film in DataDummy.generateDummyFilm()) {
            if (film.isTvShow) {
                tvShow.add(film)
            }
        }

        return tvShow
    }
}