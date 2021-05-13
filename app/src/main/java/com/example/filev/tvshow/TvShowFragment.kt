import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.filev.databinding.FragmentTvShowBinding
import com.example.filev.tvshow.TvShowAdapter
import com.example.filev.tvshow.TvShowViewModel

class TvShowFragment : Fragment() {

    lateinit var fragmentTvShowBinding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[TvShowViewModel::class.java]
            val films = viewModel.getTvShow()

            val adapterTvShow = TvShowAdapter()
            adapterTvShow.setFilms(films)

            with(fragmentTvShowBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = adapterTvShow
            }

        }
    }

}