package br.com.coupledev.pokedex.domain.entities

data class Ability(
    val ability: AbilityX,
    val isHidden: Boolean,
    val slot: Int,
)
