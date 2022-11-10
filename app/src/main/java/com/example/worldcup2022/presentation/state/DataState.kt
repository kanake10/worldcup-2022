package com.example.worldcup2022.presentation.state

import com.example.worldcup2022.models.Countries

sealed class DataState {
    class Success(val data: MutableList<Countries>) : DataState()
    class Failure(val message: String) : DataState()
    object Loading : DataState()
    object Empty : DataState()
}