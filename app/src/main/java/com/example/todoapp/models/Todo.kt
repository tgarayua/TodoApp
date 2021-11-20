package com.example.todoapp.models

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Todo(
    val id: Int,
    val title: String,
    val description: String?,
    var isChecked: Boolean = false,
    var date: String,
    val updatedAt: String,
) : Parcelable