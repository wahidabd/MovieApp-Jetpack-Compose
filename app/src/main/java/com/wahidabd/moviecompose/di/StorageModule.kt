package com.wahidabd.moviecompose.di

import android.content.Context
import androidx.room.Room
import androidx.datastore.preferences.createDataStore
import com.wahidabd.moviecompose.core.database.MovieDB
import com.wahidabd.moviecompose.core.storage.MoviePrefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule {

    @Provides
    @Singleton
    fun provideMovieDB(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, MovieDB::class.java, "movie_db")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideUserDao(movieDB: MovieDB) =
        movieDB.userDao

    @Provides
    @Singleton
    fun provideMovieDao(movieDB: MovieDB) =
        movieDB.movieDao

    @Provides
    @Singleton
    fun provideRecentSearchDao(movieDB: MovieDB) =
        movieDB.recentSearchDao

    @Provides
    @Singleton
    fun provideMoviePrefs(@ApplicationContext context: Context) =
        MoviePrefs(context.createDataStore(name = "movie_prefs"))
}