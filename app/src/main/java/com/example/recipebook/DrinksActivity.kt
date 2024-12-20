package com.example.recipebook

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class DrinksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drinks) // Используем activity_drinks.xml

        // Находим кнопки для напитков
        val buttonMojito: MaterialButton = findViewById(R.id.button_mojito)
        val buttonLemonade: MaterialButton = findViewById(R.id.button_lemonade)
        val buttonSmoothie: MaterialButton = findViewById(R.id.button_smoothie)
        val buttonGluhwein: MaterialButton = findViewById(R.id.button_gluhwein)

        // Настроим обработку нажатий на кнопки для перехода к соответствующим рецептам
        buttonMojito.setOnClickListener {
            val intent = Intent(this, MojitoRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonLemonade.setOnClickListener {
            val intent = Intent(this, LemonadeRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonSmoothie.setOnClickListener {
            val intent = Intent(this, SmoothieRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonGluhwein.setOnClickListener {
            val intent = Intent(this, GluhweinRecipeActivity::class.java)
            startActivity(intent)
        }
    }
}


