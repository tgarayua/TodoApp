package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AuthenticationRouter : AppCompatActivity() {
    private val navToAuth = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val authIntent = Intent(this, AuthActivity::class.java)
        val homeIntent = Intent(this, MainActivity::class.java)

        if (navToAuth) {
            startActivity(authIntent)
        } else {
            startActivity(homeIntent)
        }
    }
}