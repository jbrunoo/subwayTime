package com.jbrunoo.subwaytraveler.presentation.model


import com.google.gson.annotations.SerializedName

data class ErrorMessage(
    val code: String,
    val developerMessage: String,
    val link: String,
    val message: String,
    val status: Int,
    val total: Int
)