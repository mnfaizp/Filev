package com.example.filev.detail

import com.example.filev.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(manifest = Config.NONE)
class DetailFilmViewModelTest {

    private lateinit var viewModel: DetailFilmViewModel
    private val dummyFilm = DataDummy.generateDummyFilm()[0]
    private val filmId = dummyFilm.filmId

    @Before
    fun setUp() {
        viewModel = DetailFilmViewModel()
        viewModel.setSelectedFilm(filmId)
    }

    @Test
    fun getFilm() {
        viewModel.setSelectedFilm(dummyFilm.filmId)
        val filmEntity = viewModel.getFilm()
        assertNotNull(filmEntity)
        assertEquals(dummyFilm.filmId, filmEntity.filmId)
        assertEquals(dummyFilm.imagePath, filmEntity.imagePath)
        assertEquals(dummyFilm.reviewRating, filmEntity.reviewRating)
        assertEquals(dummyFilm.desctiption, filmEntity.desctiption)
        assertEquals(dummyFilm.isTvShow, filmEntity.isTvShow)
        assertEquals(dummyFilm.rate, filmEntity.rate)
        assertEquals(dummyFilm.title, filmEntity.title)
        assertEquals(dummyFilm.releasedDate, filmEntity.releasedDate)
    }

}