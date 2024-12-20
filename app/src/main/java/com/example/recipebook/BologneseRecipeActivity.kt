package com.example.recipebook

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.thread

class BologneseRecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bolognese_recipe) // Використовуємо activity_bolognese_recipe.xml

        // Підключаємо кнопку "Додати в обрані"
        val addToFavoritesButton: Button = findViewById(R.id.btn_add_to_favorites)

        // Додаємо обробник натискання
        addToFavoritesButton.setOnClickListener {
            // Створюємо об'єкт рецепта для збереження в базу даних
            val recipe = FavoriteRecipe(
                id = 0,
                title = "Болоньєзе",
                description = "Опис рецепта Болоньєзе",
                imageUrl = "android.resource://com.example.recipebook/drawable/bolognese" // переконайтесь, що використовуєте правильний параметр
            )


            // Зберігаємо рецепт у фоновому потоці
            thread {
                val db = AppDatabase.getInstance(this) // Отримуємо інстанс бази даних
                db.favoriteRecipeDao().insert(recipe) // Викликаємо DAO для збереження рецепта
            }

            // Відображаємо повідомлення користувачу
            Toast.makeText(this, "Рецепт додано в обрані!", Toast.LENGTH_SHORT).show()
        }
    }
}
