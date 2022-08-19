package com.wahidabd.moviecompose.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wahidabd.moviecompose.core.database.dao.MovieDao
import com.wahidabd.moviecompose.core.database.dao.RecentSearchDao
import com.wahidabd.moviecompose.core.database.dao.UserDao
import com.wahidabd.moviecompose.core.data.Movie
import com.wahidabd.moviecompose.core.data.RecentSearch
import com.wahidabd.moviecompose.core.data.UserEntity


@Database(entities = [UserEntity::class, Movie::class, RecentSearch::class], version = 1, exportSchema = false)
abstract class MovieDB : RoomDatabase() {
    abstract val userDao: UserDao
    abstract val movieDao: MovieDao
    abstract val recentSearchDao: RecentSearchDao
}