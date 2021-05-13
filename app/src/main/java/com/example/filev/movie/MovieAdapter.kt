package com.example.filev.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.filev.R
import com.example.filev.data.FilmEntity
import com.example.filev.databinding.ItemFilmListBinding
import com.example.filev.detail.DetailFilmActivity
import com.example.filev.detail.DetailFilmActivity.Companion.EXTRA_FILM

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listFilms = ArrayList<FilmEntity>()

    class MovieViewHolder(private val binding: ItemFilmListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(film: FilmEntity) {
            with(binding) {
                tvItemTitle.text = film.title
                tvItemYear.text = film.releasedDate

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailFilmActivity::class.java)
                    intent.putExtra(EXTRA_FILM, film.filmId)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(film.imagePath)
                    .error(R.drawable.ic_error)
                    .into(imagePoster)
            }
        }
    }

    fun setFilms(films: List<FilmEntity>?) {
        if (films == null) return
        this.listFilms.clear()
        this.listFilms.addAll(films)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.MovieViewHolder {
        val itemFilmListBinding =
            ItemFilmListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemFilmListBinding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val film = listFilms[position]

        if (!film.isTvShow) {
            holder.bind(film)
        }


    }

    override fun getItemCount(): Int {
        return listFilms.size
    }
}