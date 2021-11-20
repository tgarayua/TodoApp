package com.example.todoapp.repo.local

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.todoapp.view.dataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

class DatastorePreferences(val context: Context) {
    private val jwt = stringPreferencesKey("it")
    suspend fun setJWT(jwt: String) {
        context.dataStore.edit { preferences ->
            preferences[this.jwt] = jwt
        }
    }

    suspend fun getJWT(): String? {
        return context.dataStore.data.map {
            it[jwt]
        }. first()
    }
}