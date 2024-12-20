package com.example.recipebook.dao

import androidx.room.Insert
import androidx.room.Dao
import androidx.room.Query
import com.example.recipebook.FavoriteRecipe

@Dao
interface FavoriteRecipeDao {
    @Insert
    fun insert(favoriteRecipe: FavoriteRecipe)

    @Query("SELECT * FROM favorite_recipes")
    fun getAllFavorites(): List<FavoriteRecipe>
}

