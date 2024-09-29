package com.example.starwarsapimobile.swapi.data

import com.google.gson.annotations.SerializedName

data class Vehicle(@SerializedName("max_atmosphering_speed")
                       val maxAtmospheringSpeed: String = "",
                   @SerializedName("cargo_capacity")
                       val cargoCapacity: String = "",
                   @SerializedName("films")
                       val films: List<String>?,
                   @SerializedName("passengers")
                       val passengers: String = "",
                   @SerializedName("edited")
                       val edited: String = "",
                   @SerializedName("consumables")
                       val consumables: String = "",
                   @SerializedName("created")
                       val created: String = "",
                   @SerializedName("length")
                       val length: String = "",
                   @SerializedName("url")
                       val url: String = "",
                   @SerializedName("manufacturer")
                       val manufacturer: String = "",
                   @SerializedName("crew")
                       val crew: String = "",
                   @SerializedName("vehicle_class")
                       val vehicleClass: String = "",
                   @SerializedName("cost_in_credits")
                       val costInCredits: String = "",
                   @SerializedName("name")
                       val name: String = "",
                   @SerializedName("model")
                       val model: String = "")