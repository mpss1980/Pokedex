package br.com.coupledev.pokedex.domain.repositories

import br.com.coupledev.pokedex.domain.models.PokemonModel
import br.com.coupledev.pokedex.shared.util.Resource

interface PokemonRepository {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<List<PokemonModel>>
    suspend fun getPokemon(pokemonName: String): Resource<PokemonModel>
}