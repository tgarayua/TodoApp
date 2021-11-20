package com.example.todoapp.repo.remote

import com.example.todoapp.models.AuthResponse
import com.example.todoapp.models.LoginBody
import com.example.todoapp.models.RegisterBody
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("auth/register")
    suspend fun register(@Body() body: RegisterBody): AuthResponse

    @POST("auth/login")
    suspend fun login(@Body() body: LoginBody): AuthResponse
}