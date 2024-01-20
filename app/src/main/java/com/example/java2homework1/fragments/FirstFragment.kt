package com.example.java2homework1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.java2homework1.R
import com.example.java2homework1.adapter.Ani_Adapter
import com.example.java2homework1.data.Anime
import com.example.java2homework1.databinding.FragmentFirstBinding

class FirstFragment : Fragment(), OncClick {
    private var _binding: FragmentFirstBinding? = null
    private val binding: FragmentFirstBinding get() = _binding!!
    private val aniAdapter = Ani_Adapter(this)

    private val animeList = mutableListOf(
        Anime(
            "https://c4.wallpaperflare.com/wallpaper/295/163/719/anime-anime-boys-picture-in-picture-kimetsu-no-yaiba-kamado-tanjir%C5%8D-hd-wallpaper-preview.jpg",
            "anime boys, picture-in-picture, Kimetsu no Yaiba, Kamado Tanjirō"
        ),
        Anime(
            "https://c4.wallpaperflare.com/wallpaper/693/688/935/uchiha-madara-naruto-shippuuden-wallpaper-preview.jpg",
            " man holding sword animated painting, Uchiha Madara, Naruto Shippuuden"
        ),
        Anime(
            "https://c4.wallpaperflare.com/wallpaper/158/122/422/anime-anime-boys-jujutsu-kaisen-yuji-itadori-sakuna-hd-wallpaper-preview.jpg",
            "anime, anime boys, Jujutsu Kaisen, Yuji Itadori, Sakuna"
        ),
        Anime(
            "https://c4.wallpaperflare.com/wallpaper/916/657/97/anime-your-name-hd-wallpaper-preview.jpg",
            " Anime, Your Name."
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.rvAnime.adapter = aniAdapter
        aniAdapter.setAnimeList(animeList)

    }

    override fun onClick(anime: Anime) {
        findNavController().navigate(
            R.id.action_firstFragment_to_detailFragment2
        )
        DetailFragment.animeModel = anime
    }
}

