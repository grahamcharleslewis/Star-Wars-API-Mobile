package com.example.starwarsapimobile.swapi.data

import com.google.gson.annotations.SerializedName

data class Planet(
    @SerializedName("films")
    val films: List<String>?,
    @SerializedName("edited")
    val edited: String = "",
    @SerializedName("created")
    val created: String = "",
    @SerializedName("climate")
    val climate: String = "",
    @SerializedName("rotation_period")
    val rotationPeriod: String = "",
    @SerializedName("url")
    val url: String = "",
    @SerializedName("population")
    val population: String = "",
    @SerializedName("orbital_period")
    val orbitalPeriod: String = "",
    @SerializedName("surface_water")
    val surfaceWater: String = "",
    @SerializedName("diameter")
    val diameter: String = "",
    @SerializedName("gravity")
    val gravity: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("residents")
    val people: List<String>?,
    @SerializedName("terrain")
    val terrain: String = ""
)