package com.example.whatididlearn.data

import androidx.lifecycle.LiveData
import com.example.whatididlearn.database.LearnedItemDao
import com.example.whatididlearn.entities.LearnedItem


class LearnedItemRepository (private val dao: LearnedItemDao){
    val learnedItem: LiveData<List<LearnedItem>> = dao.getAll()

    fun addNewItem(item: LearnedItem){
        dao.insert(item)
    }
}
