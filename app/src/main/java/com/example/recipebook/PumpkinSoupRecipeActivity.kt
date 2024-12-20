package com.example.recipebook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PumpkinSoupRecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pumpkin_soup_recipe)

        // Налаштування toolbar
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Рецепт гарбузового супу"
    }
}
