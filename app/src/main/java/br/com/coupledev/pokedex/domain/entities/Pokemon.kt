package br.com.coupledev.pokedex.domain.entities

data class Pokemon(
    val abilities: List<Ability>,
    val baseExperience: Int,
    val forms: List<Form>,
)
