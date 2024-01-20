package com.example.java2homework1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.java2homework1.data.Anime
import com.example.java2homework1.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private  var _binding: FragmentDetailBinding? = null
    private val binding:FragmentDetailBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
        setupListener()
    }

    private fun getData() {
        binding.tvText.text = animeModel?.name
    }

    private fun setupListener() {
        binding.btnGoBack.setOnClickListener {
            findNavController().context
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        var animeModel: Anime? = null
    }
}