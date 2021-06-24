package com.example.whatididlearn.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.whatididlearn.entities.LearnedItem

class MainViewModel(private val repository: LearnedItemRepository) : ViewModel() {
    val learnedItem: LiveData<List<LearnedItem>> = repository.learnedItem
}