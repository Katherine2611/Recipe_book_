package com.example.recipebook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import com.google.android.material.button.MaterialButton


class DessertsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desserts) // Використання activity_desserts.xml

        // Знаходимо RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.rv_desserts)

        // Налаштовуємо обробник натискання на кнопку
        val buttonNapoleon: MaterialButton = findViewById(R.id.button_napoleon)
        val buttonPudding: MaterialButton = findViewById(R.id.button_pudding)
        val buttonCheesecake: MaterialButton = findViewById(R.id.button_cheesecake)

        buttonNapoleon.setOnClickListener {
            val intent = Intent(this, NapoleonRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonPudding.setOnClickListener {
            val intent = Intent(this, PuddingRecipeActivity::class.java)
            startActivity(intent)
        }

        buttonCheesecake.setOnClickListener {
            val intent = Intent(this, CheesecakeRecipeActivity::class.java)
            startActivity(intent)
        }

        val fondantButton: MaterialButton = findViewById(R.id.button_fondant)
        fondantButton.setOnClickListener {
            val intent = Intent(this, ChocolateFondantRecipeActivity::class.java)
            startActivity(intent)
        }

        }
    }

