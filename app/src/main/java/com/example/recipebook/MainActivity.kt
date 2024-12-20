package com.example.recipebook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Ваш список рецептів
    private val recipes = listOf("Мохіто", "Наполеон", "Суп", "Салат", "Десерт", "Напій")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Знаходимо SearchView для пошуку
        val searchView: SearchView = findViewById(R.id.search_view)

        // Обробка введеного тексту для пошуку
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Коли натискається кнопка пошуку
                query?.let {
                    performSearch(it)  // Викликаємо функцію пошуку
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Коли змінюється текст у SearchView
                newText?.let {
                    performSearch(it)  // Викликаємо функцію пошуку
                }
                return true
            }
        })

        // Знаходимо кнопку для переходу до обраних рецептів
        val goToFavoritesButton: Button = findViewById(R.id.btn_go_to_favorites)
        goToFavoritesButton.setOnClickListener {
            // Переходимо на екран обраних
            val intent = Intent(this, FavoritesActivity::class.java)
            startActivity(intent)
        }

        // Кнопки для переходу до категорій
        val buttonDesserts = findViewById<Button>(R.id.button_desserts)
        val buttonSalads = findViewById<Button>(R.id.button_salads)
        val buttonSoups = findViewById<Button>(R.id.button_soups)
        val buttonMainCourses = findViewById<Button>(R.id.button_main_courses)
        val buttonDrinks = findViewById<Button>(R.id.button_drinks)

        buttonDesserts.setOnClickListener {
            startActivity(Intent(this, DessertsActivity::class.java))
        }
        buttonSalads.setOnClickListener {
            startActivity(Intent(this, SaladsActivity::class.java))
        }
        buttonSoups.setOnClickListener {
            startActivity(Intent(this, SoupsActivity::class.java))
        }
        buttonMainCourses.setOnClickListener {
            startActivity(Intent(this, MainDishesActivity::class.java))
        }
        buttonDrinks.setOnClickListener {
            startActivity(Intent(this, DrinksActivity::class.java))
        }
    }

    // Функція для пошуку
    private fun performSearch(query: String) {
        // Фільтрація рецептів за введеним текстом
        val filteredRecipes = recipes.filter { it.contains(query, ignoreCase = true) }

        // Якщо знайдено рецепти, вивести їх і перейти до рецепту
        if (filteredRecipes.isNotEmpty()) {
            val recipeName = filteredRecipes[0]  // Вибір першого знайденого рецепту
            val intent = Intent(this, RecipeDetailActivity::class.java).apply {
                putExtra("RECIPE_NAME", recipeName)  // Передаємо назву рецепту
            }
            startActivity(intent)  // Перехід до активності з деталями рецепту
        } else {
            Toast.makeText(this, "Рецепти не знайдено", Toast.LENGTH_SHORT).show()
        }
    }
}
