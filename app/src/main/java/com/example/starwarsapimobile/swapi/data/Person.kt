package com.example.starwarsapimobile.swapi.data

import com.google.gson.annotations.SerializedName

data class Person(
    @SerializedName("films")
    val films: List<String>?,
    @SerializedName("homeworld")
    val homeworld: String = "",
    @SerializedName("gender")
    val gender: String = "",
    @SerializedName("skin_color")
    val skinColor: String = "",
    @SerializedName("edited")
    val edited: String = "",
    @SerializedName("created")
    val created: String = "",
    @SerializedName("mass")
    val mass: String = "",
    @SerializedName("vehicles")
    val vehicles: List<String>?,
    @SerializedName("url")
    val url: String = "",
    @SerializedName("hair_color")
    val hairColor: String = "",
    @SerializedName("birth_year")
    val birthYear: String = "",
    @SerializedName("eye_color")
    val eyeColor: String = "",
    @SerializedName("species")
    val species: List<String>?,
    @SerializedName("starships")
    val starships: List<String>?,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("height")
    val height: String = ""
)