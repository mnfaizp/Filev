package com.example.filev.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.filev.R
import com.example.filev.data.FilmEntity
import com.example.filev.databinding.ItemFilmListBinding
import com.example.filev.detail.DetailFilmActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private var listFilms = ArrayList<FilmEntity>()

    fun setFilms(films: List<FilmEntity>?) {
        if (films == null) return
        this.listFilms.clear()
        this.listFilms.addAll(films)
    }

    class TvShowViewHolder(private val binding: ItemFilmListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(film: FilmEntity) {
            with(binding) {
                tvItemTitle.text = film.title
                tvItemYear.text = film.releasedDate

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailFilmActivity::class.java)
                    intent.putExtra(DetailFilmActivity.EXTRA_FILM, film.filmId)
                    itemView.context.startActivity(intent)
                }

                Glide.with(itemView.context)
                    .load(film.imagePath)
                    .error(R.drawable.ic_error)
                    .into(imagePoster)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvShowAdapter.TvShowViewHolder {
        val itemFilmListBinding =
            ItemFilmListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemFilmListBinding)
    }

    override fun onBindViewHolder(holder: TvShowAdapter.TvShowViewHolder, position: Int) {
        val film = listFilms[position]

        if (film.isTvShow) {
            holder.bind(film)
        }
    }

    override fun getItemCount(): Int {
        return listFilms.size
    }
}