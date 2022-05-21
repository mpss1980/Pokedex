package br.com.coupledev.pokedex.data.repositories

import br.com.coupledev.pokedex.data.remote.PokeApi
import br.com.coupledev.pokedex.domain.models.PokemonModel
import br.com.coupledev.pokedex.domain.repositories.PokemonRepository
import br.com.coupledev.pokedex.shared.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepositoryImpl @Inject constructor(
    private val api: PokeApi
) : PokemonRepository {

    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<List<PokemonModel>> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error has occurred.")
        }
        return Resource.Success(listOf())
    }

    override suspend fun getPokemon(pokemonName: String): Resource<PokemonModel> {
        val response = try {
            val pokemon = api.getPokemonInfo(pokemonName)
            PokemonModel(name = pokemon.name)
        } catch (e: Exception) {
            return Resource.Error("An unknown error has occurred.")
        }
        return Resource.Success(response)
    }
}