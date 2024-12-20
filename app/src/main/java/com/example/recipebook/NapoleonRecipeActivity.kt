package com.example.recipebook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NapoleonRecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_napoleon_recipe)

        // Ініціалізуємо тулбар
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Якщо хочете додати інші функціональності, можна використовувати код тут
    }
}

