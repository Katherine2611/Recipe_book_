package com.example.recipebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoriesAdapter(private val categoryList: List<String>) :
    RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>() {

    // Клас, що зберігає View для елементу списку
    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewCategory: TextView = itemView.findViewById(R.id.tv_category_name)
    }

    // Створення нового ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    // Заповнення даними кожного елементу списку
    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.textViewCategory.text = categoryList[position]
    }

    // Повернення кількості елементів у списку
    override fun getItemCount(): Int = categoryList.size
}
