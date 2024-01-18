package com.jbrunoo.subwaytraveler.presentation.model


import com.google.gson.annotations.SerializedName

data class Subway(
    val errorMessage: ErrorMessage,
    val realtimeArrivalList: List<RealtimeArrival>
)