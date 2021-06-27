package com.example.drinkstorelax.data

import com.google.gson.annotations.SerializedName

data class DrinkListRemoteEntity(
    @SerializedName("drinks")
    val drinkList: List<DrinkRemoteEntity>
)