package com.example.manorroom

import androidx.lifecycle.ViewModel

class ZodiacListViewModel : ViewModel() {

    val zodiacs = mutableListOf<Zodiac>()

    init {
        for (i in 0 until 20) {
            val zodiac = Zodiac(
                name = "",
                description = "",
                symbol = "",
                month = ""
            )
        }
    }
}