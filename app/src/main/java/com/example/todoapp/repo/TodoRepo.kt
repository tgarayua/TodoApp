package com.example.todoapp.repo

import com.example.todoapp.models.Todo
import com.example.todoapp.repo.remote.RetrofitInstance

class TodoRepo(token: String) {
    private val headers = mapOf(Pair("Authorization", token))

    suspend fun getAllTodos(): List<Todo> {
        return RetrofitInstance.todoService.getTodos(headers)
    }
}