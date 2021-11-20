package com.example.todoapp.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class AddTodoBody(
    val title: String,
    val description: String,
    val isChecked: Boolean
)