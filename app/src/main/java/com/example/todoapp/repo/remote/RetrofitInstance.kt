package com.example.todoapp.repo.remote

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

object RetrofitInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://knex-todo.herokuapp.com/api/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val todoService: TodoService = retrofit.create(TodoService::class.java)

    val authService: AuthService = retrofit.create(AuthService::class.java)
}