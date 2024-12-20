package com.example.recipebook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

abstract class CategoryActivity : AppCompatActivity() {
    abstract val categoryTitle: String
    abstract val recipes: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 16, 16, 16)
        }

        // Заголовок категорії
        val titleView = TextView(this).apply {
            text = categoryTitle
            textSize = 24f
            setTextColor(ContextCompat.getColor(this@CategoryActivity, android.R.color.black))
            textAlignment = TextView.TEXT_ALIGNMENT_CENTER
        }

        layout.addView(titleView)

        // Генерація кнопок для рецептів
        for (recipe in recipes) {
            val button = Button(this).apply {
                text = recipe
                setBackgroundColor(ContextCompat.getColor(this@CategoryActivity, R.color.fbceb1))
                setTextColor(ContextCompat.getColor(this@CategoryActivity, android.R.color.black))
            }
            layout.addView(button)
        }

        setContentView(layout)
    }
}
