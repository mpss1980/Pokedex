package br.com.coupledev.pokedex.data.remote.responses

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire")
    val omegaRubyAlphaSapphire: OmegarubyAlphasapphire,
    @SerializedName("x-y")
    val xy: XY
)