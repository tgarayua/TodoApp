package com.example.todoapp.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class UpdateTodoBody(
    val title: String?,
    val description: String?,
    val completed: Boolean?,
)