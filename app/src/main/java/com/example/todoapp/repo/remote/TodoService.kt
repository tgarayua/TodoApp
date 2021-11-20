package com.example.todoapp.repo.remote

import com.example.todoapp.models.Todo
import com.example.todoapp.models.LoginBody
import retrofit2.http.*

interface TodoService {
    @POST("todos")
    suspend fun addTodo(@Body() body: LoginBody, @HeaderMap headers: Map<String, String>): Todo

    @PUT("todos/{id}")
    suspend fun updateTodo(@Path("id")id: String, @Body() body: LoginBody, @HeaderMap headers: Map<String, String>): Todo

    @GET("todos")
    suspend fun getTodos(@HeaderMap headers: Map<String, String>): List<Todo>

    @GET("todos/{id}")
    suspend fun getTodoByID(@Path("id") id: String, @HeaderMap headers: Map<String, String>): Todo
}