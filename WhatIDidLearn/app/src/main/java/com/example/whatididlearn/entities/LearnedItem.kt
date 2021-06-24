package com.example.whatididlearn.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "learned_item")
data class LearnedItem (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "item_id")
    val id: Int = 0,
    @ColumnInfo(name = "item_title")
    val name: String,
    @ColumnInfo(name = "item_description")
    val description: String,
    @ColumnInfo(name = "item_level")
    val understandingLevel: UnderstandingLevel
)

//como val understandingLevel é do tipo primario, e room não consegue salvar ele dessa forma
//é necessário que haja uma conversão dele para Int. Feita no Converters