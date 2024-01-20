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
import com.example.java2homework1.databinding.FragmentSecondBinding

class SecondFragment : Fragment(), OncClick {
    private var _binding: FragmentSecondBinding? = null
    private val binding: FragmentSecondBinding get() = _binding!!
    private val aniAdapter = Ani_Adapter(this)

    private fun onItemClick (anime: Anime) {

    }

    private val animeList = mutableListOf(
        Anime(
            "data:image/jpeg;base64,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",
            "Проклятие Аннабель",
        ),
        Anime(
            "https://avatars.dzeninfra.ru/get-zen_doc/5284703/pub_6411e42499a043222a998520_6412b5f9ee5388618f21527a/scale_1200",
            "Астрал",
        ),
        Anime(
            "data:image/jpeg;base64,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",
            "Кошмар на улице вязов",
        ),
        Anime(
            "data:image/jpeg;base64,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",
            "Пила",
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initialize() {
        binding.recarClerView2.adapter = aniAdapter
        aniAdapter.setAnimeList(animeList)
    }

    override fun onClick(anime: Anime) {

    }
}