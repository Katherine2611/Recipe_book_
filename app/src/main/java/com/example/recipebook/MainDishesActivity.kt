package com.example.recipebook

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainDishesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dishes) // Використовуємо activity_main_dishes.xml

        // Знаходимо кнопки для основних страв
        val buttonBolognese: MaterialButton = findViewById(R.id.button_bolognese)
        val buttonPilaf: MaterialButton = findViewById(R.id.button_pilaf)
        val buttonSteak: MaterialButton = findViewById(R.id.button_steak)
        val buttonLasagna: MaterialButton = findViewById(R.id.button_lasagna)

        // Налаштовуємо натискання на кнопки для переходу до відповідних рецептів
        buttonBolognese.setOnClickListener {
            val intent = Intent(this, BologneseRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonPilaf.setOnClickListener {
            val intent = Intent(this, PilafRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonSteak.setOnClickListener {
            val intent = Intent(this, SteakRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonLasagna.setOnClickListener {
            val intent = Intent(this, LasagnaRecipeActivity::class.java)
            startActivity(intent)
        }
    }
}
