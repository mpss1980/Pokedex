package br.com.coupledev.pokedex.shared.di

import br.com.coupledev.pokedex.data.remote.PokeApi
import br.com.coupledev.pokedex.data.repositories.PokemonRepositoryImpl
import br.com.coupledev.pokedex.shared.constants.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        api: PokeApi
    ) = PokemonRepositoryImpl(api)

    @Singleton
    @Provides
    fun providePokemonPokeApi(): PokeApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create()
    }
}