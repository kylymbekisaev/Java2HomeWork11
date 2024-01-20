package com.example.java2homework1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.R
import com.example.java2homework1.data.Anime
import com.example.java2homework1.databinding.ItemanimeBinding
import com.example.java2homework1.fragments.OncClick


class Ani_Adapter(val oncClick: OncClick) :
    RecyclerView.Adapter<Ani_Adapter.AnimeViewHolder>() {

    private var AnimeList = mutableListOf<Anime>()

    fun setAnimeList(animelList: MutableList<Anime>) {
        this.AnimeList = animelList
    }

    inner class AnimeViewHolder(private val binding: ItemanimeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBInd(anime: Anime) = with(binding) {
            binding.root.setOnClickListener {
                oncClick.onClick(anime)
            }
            Glide.with(ivAnime.context)
                .load(anime.image)
                .placeholder(R.drawable.abc_ab_share_pack_mtrl_alpha)
                .into(ivAnime)
            tvName.text = anime.name.replace("[", "").replace("]", "")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val binding = ItemanimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.onBInd(AnimeList[position])
    }

    override fun getItemCount() = AnimeList.size
}