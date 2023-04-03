package com.example.manorroom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.manorroom.databinding.FragmentZodiacDetailBinding


class ZodiacDetail : Fragment() {

    private lateinit var binding: FragmentZodiacDetailBinding

    private lateinit var zodiac: Zodiac

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        zodiac = Zodiac(
            name = "",
            description = "",
            symbol = "",
            month = ""
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentZodiacDetailBinding.inflate(layoutInflater, container, return binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            zodiac
        }
    }
}
