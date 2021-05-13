package com.example.filev.utils

import com.example.filev.R
import com.example.filev.data.FilmEntity

object DataDummy {

    fun generateDummyFilm(): List<FilmEntity> {

        val films = ArrayList<FilmEntity>()

        films.add(
            FilmEntity(
                "a001",
                "A Start Is Born",
                "2000",
                "Film Description",
                R.drawable.poster_a_start_is_born,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "a002",
                "Alita Battle Angle",
                "2000",
                "Film Description",
                R.drawable.poster_alita,
                false,
                "12",
                85
            )
        )

        films.add(
            FilmEntity(
                "a003",
                "Aquaman",
                "2000",
                "Film Description",
                R.drawable.poster_aquaman,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "a004",
                "Bohemian Rhapsody",
                "2000",
                "Film Description",
                R.drawable.poster_bohemian,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "a005",
                "Cold Pursuit",
                "2000",
                "Film Description",
                R.drawable.poster_cold_persuit,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "a006",
                "Creed II",
                "2000",
                "Film Description",
                R.drawable.poster_creed,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "a007",
                "The Crimes of Grindelwald",
                "2000",
                "Film Description",
                R.drawable.poster_crimes,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "a008",
                "Glass",
                "2000",
                "Film Description",
                R.drawable.poster_glass,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "a009",
                "How To Train Your Dragon",
                "2000",
                "Film Description",
                R.drawable.poster_how_to_train,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "a010",
                "Avengers Infinity War",
                "2000",
                "Film Description",
                R.drawable.poster_infinity_war,
                false,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b001",
                "Arrow",
                "2000",
                "Film Description",
                R.drawable.poster_arrow,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b002",
                "Doom Patrol",
                "2000",
                "Film Description",
                R.drawable.poster_doom_patrol,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b010",
                "Dragon Ball",
                "2000",
                "Film Description",
                R.drawable.poster_dragon_ball,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b003",
                "Fairy Tail",
                "2000",
                "Film Description",
                R.drawable.poster_fairytail,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b004",
                "Family Guy",
                "2000",
                "Film Description",
                R.drawable.poster_family_guy,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b005",
                "Flash",
                "2000",
                "Film Description",
                R.drawable.poster_flash,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b006",
                "GOT",
                "2000",
                "Film Description",
                R.drawable.poster_god,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b007",
                "Gotham",
                "2000",
                "Film Description",
                R.drawable.poster_gotham,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b008",
                "Grey's Anatomy",
                "2000",
                "Film Description",
                R.drawable.poster_grey_anatomy,
                true,
                "18+",
                85
            )
        )

        films.add(
            FilmEntity(
                "b009",
                "Hanna",
                "2000",
                "Film Description",
                R.drawable.poster_hanna,
                true,
                "18+",
                85
            )
        )

        return films
    }
}