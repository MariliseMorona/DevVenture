package com.example.drinkstorelax.data.network

import com.example.drinkstorelax.data.DrinkListRemoteEntity
import retrofit2.http.GET

interface TheCocktailApi {
    @GET("filter.php?a=Alcoholic")
    suspend fun getDrinks(): DrinkListRemoteEntity

    @GET("filter.php?a=Non_Alcoholic")
    suspend fun getDrinksNonAlcoholic(): DrinkListRemoteEntity
}