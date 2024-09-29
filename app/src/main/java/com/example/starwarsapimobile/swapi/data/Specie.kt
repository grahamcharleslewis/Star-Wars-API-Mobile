package com.example.starwarsapimobile.swapi.data

import com.google.gson.annotations.SerializedName

data class Specie(@SerializedName("films")
                   val films: List<String>?,
                  @SerializedName("skin_colors")
                   val skinColors: String = "",
                  @SerializedName("homeworld")
                   val homeworld: String = "",
                  @SerializedName("edited")
                   val edited: String = "",
                  @SerializedName("created")
                   val created: String = "",
                  @SerializedName("eye_colors")
                   val eyeColors: String = "",
                  @SerializedName("language")
                   val language: String = "",
                  @SerializedName("classification")
                   val classification: String = "",
                  @SerializedName("people")
                   val people: List<String>?,
                  @SerializedName("url")
                   val url: String = "",
                  @SerializedName("hair_colors")
                   val hairColors: String = "",
                  @SerializedName("average_height")
                   val averageHeight: String = "",
                  @SerializedName("name")
                   val name: String = "",
                  @SerializedName("designation")
                   val designation: String = "",
                  @SerializedName("average_lifespan")
                   val averageLifespan: String = "")