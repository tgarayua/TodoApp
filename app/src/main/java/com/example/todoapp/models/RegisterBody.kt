package com.example.todoapp.models

import android.os.Parcelable
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RegisterBody(
    val username: String,
    val email: String,
    val password: String
)
