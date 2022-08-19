package com.wahidabd.moviecompose.core.storage

import androidx.datastore.DataStore
import androidx.datastore.preferences.*
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import javax.inject.Singleton

@Singleton
class MoviePrefs constructor(private val movieStore: DataStore<Preferences>) {

    companion object{
        private val LOGGED_IN_USER_ID = preferencesKey<Long>("logged_in_user_id")
    }

    suspend fun setLoggedUserId(id: Long){
        movieStore.edit {
            it[LOGGED_IN_USER_ID] = id
        }
    }

    suspend fun clear(){
        movieStore.edit {
            it.clear()
        }
    }

    suspend fun userId(): Long =
        movieStore.data.first()[LOGGED_IN_USER_ID] ?: -1

    fun loggedInUserIdLiveData(): LiveData<Long?> = movieStore.data.map { it[LOGGED_IN_USER_ID] }.asLiveData()

}