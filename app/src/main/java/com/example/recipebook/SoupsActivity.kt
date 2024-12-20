package com.example.recipebook

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class SoupsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soups) // Використовуємо activity_soups.xml

        // Знаходимо кнопки для супів
        val buttonBorscht: MaterialButton = findViewById(R.id.button_borscht)
        val buttonPumpkin: MaterialButton = findViewById(R.id.button_pumpkin)
        val buttonSolyanka: MaterialButton = findViewById(R.id.button_solyanka)
        val buttonRamen: MaterialButton = findViewById(R.id.button_ramen)

        // Налаштовуємо натискання на кнопки для переходу до відповідних рецептів
        buttonBorscht.setOnClickListener {
            val intent = Intent(this, BorschtRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonPumpkin.setOnClickListener {
            val intent = Intent(this, PumpkinSoupRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonSolyanka.setOnClickListener {
            val intent = Intent(this, SolyankaRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonRamen.setOnClickListener {
            val intent = Intent(this, RamenRecipeActivity::class.java)
            startActivity(intent)
        }
    }
}
