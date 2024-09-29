package com.example.starwarsapimobile.swapi.data

import com.google.gson.annotations.SerializedName

data class Films(@SerializedName("next")
                 val next: String = "",
                 @SerializedName("previous")
                 val previous: String = "",
                 @SerializedName("count")
                 val count: Int = 0,
                 @SerializedName("results")
                 val results: List<Film>?)