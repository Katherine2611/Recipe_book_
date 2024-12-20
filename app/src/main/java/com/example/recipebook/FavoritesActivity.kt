package com.example.recipebook

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.adapter.FavoriteRecipeAdapter // Ваш адаптер
import com.example.recipebook.AppDatabase
import com.example.recipebook.FavoriteRecipe

    class FavoritesActivity : AppCompatActivity() {
        private lateinit var recyclerView: RecyclerView
        private lateinit var adapter: FavoriteRecipeAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_favorites)

            recyclerView = findViewById(R.id.recycler_favorites)
            recyclerView.layoutManager = LinearLayoutManager(this)

            Thread {
                val db = AppDatabase.getInstance(this)
                val favorites = db.favoriteRecipeDao().getAllFavorites()

                runOnUiThread {
                    adapter = FavoriteRecipeAdapter(favorites)
                    recyclerView.adapter = adapter
                }
            }.start()
        }
    }