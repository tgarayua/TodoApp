package com.example.todoapp.repo

import com.example.todoapp.models.AuthResponse
import com.example.todoapp.models.LoginBody
import com.example.todoapp.models.RegisterBody
import com.example.todoapp.repo.remote.RetrofitInstance

object AuthRepo {
    suspend fun login(loginInfo: LoginBody): AuthResponse {
        return  RetrofitInstance.authService.login(loginInfo)
    }
    suspend fun register(registerInfo: RegisterBody): AuthResponse {
        return RetrofitInstance.authService.register(registerInfo)
    }
}