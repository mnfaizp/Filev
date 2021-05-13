package com.example.filev.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.filev.R
import com.example.filev.data.FilmEntity
import com.example.filev.databinding.ActivityDetailFilmBinding
import com.example.filev.databinding.ContentDetailFilmBinding

class DetailFilmActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_FILM = "extra_film"
    }

    private lateinit var contentDetailFilmBinding: ContentDetailFilmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailFilmBinding = ActivityDetailFilmBinding.inflate(layoutInflater)
        contentDetailFilmBinding = activityDetailFilmBinding.detailContent

        setContentView(activityDetailFilmBinding.root)

        setSupportActionBar(activityDetailFilmBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailFilmViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val filmId = extras.getString(EXTRA_FILM)
            if (filmId != null) {
                viewModel.setSelectedFilm(filmId)
                showFilm(viewModel.getFilm())
            }
        }
    }

    private fun showFilm(film: FilmEntity) {
        with(contentDetailFilmBinding) {
            tvTitle.text = film.title
            tvDescription.text = film.desctiption
            tvRate.text = film.rate
            tvScore.text = resources.getString(R.string.user_score_value, film.reviewRating)
            tvYear.text = film.releasedDate
        }

        Glide.with(this)
            .load(film.imagePath)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.overrideOf(200, 250)
                    .error(R.drawable.ic_error)
            )
            .into(contentDetailFilmBinding.imagePoster)

    }
}