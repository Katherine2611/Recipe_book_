package com.example.recipebook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import com.google.android.material.button.MaterialButton
import com.example.recipebook.CaesarRecipeActivity
import com.example.recipebook.GreekRecipeActivity
import com.example.recipebook.OlivierRecipeActivity
import com.example.recipebook.VinegretRecipeActivity


class SaladsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salads) // Використовуємо activity_salads.xml

        // Знаходимо кнопки для салатів
        val buttonCaesar: MaterialButton = findViewById(R.id.button_caesar)
        val buttonGreek: MaterialButton = findViewById(R.id.button_greek)
        val buttonOlivier: MaterialButton = findViewById(R.id.button_olivier)
        val buttonVinegret: MaterialButton = findViewById(R.id.button_vinegret)

        // Налаштовуємо натискання на кнопки для переходу до відповідних рецептів
        buttonCaesar.setOnClickListener {
            val intent = Intent(this, CaesarRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonGreek.setOnClickListener {
            val intent = Intent(this, GreekRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonOlivier.setOnClickListener {
            val intent = Intent(this, OlivierRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonVinegret.setOnClickListener {
            val intent = Intent(this, VinegretRecipeActivity::class.java)
            startActivity(intent)
        }
    }
}
