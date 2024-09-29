package com.example.starwarsapimobile.swapi.data

import com.google.gson.annotations.SerializedName

data class Film(@SerializedName("edited")
                 val edited: String = "",
                @SerializedName("director")
                 val director: String = "",
                @SerializedName("created")
                 val created: String = "",
                @SerializedName("vehicles")
                 val vehicles: List<String>?,
                @SerializedName("opening_crawl")
                 val openingCrawl: String = "",
                @SerializedName("title")
                 val title: String = "",
                @SerializedName("url")
                 val url: String = "",
                @SerializedName("characters")
                 val people: List<String>?,
                @SerializedName("episode_id")
                 val episodeId: Int = 0,
                @SerializedName("planets")
                 val planets: List<String>?,
                @SerializedName("release_date")
                 val releaseDate: String = "",
                @SerializedName("starships")
                 val starships: List<String>?,
                @SerializedName("species")
                 val species: List<String>?,
                @SerializedName("producer")
                 val producer: String = "")