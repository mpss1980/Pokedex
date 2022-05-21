package br.com.coupledev.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: Emerald,
    @SerializedName("firered-leafgreen")
    val fireRedLeafGreen: FireredLeafgreen,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphire
)