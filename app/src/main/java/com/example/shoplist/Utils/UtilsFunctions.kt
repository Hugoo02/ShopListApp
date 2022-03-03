package com.example.shoplist.Utils

import com.example.shoplist.Models.CategoryModel
import com.example.shoplist.Models.ItemModel
import com.example.shoplist.R

class UtilsFunctions {

    fun getCategories() : ArrayList<CategoryModel>{

        val categories = ArrayList<CategoryModel>()

        categories.add(CategoryModel("Fruta e Legumes", R.drawable.fruits_vegetables))
        categories.add(CategoryModel("Bebidas", R.drawable.water))
        categories.add(CategoryModel("Refeições Prontas", R.drawable.food))
        categories.add(CategoryModel("Laticínios e Ovos", R.drawable.milk))
        categories.add(CategoryModel("Congelados", null))
        categories.add(CategoryModel("Charcutaria e Queijos", null))
        categories.add(CategoryModel("Mercearia", null))
        categories.add(CategoryModel("Talho e Peixaria", null))
        categories.add(CategoryModel("Padaria e Pastelaria", null))
        categories.add(CategoryModel("Bio e Saudável", null))
        categories.add(CategoryModel("Limpeza", null))
        categories.add(CategoryModel("Higiene e Beleza", null))
        categories.add(CategoryModel("Bebé", null))
        categories.add(CategoryModel("Casa e Jardim", null))
        categories.add(CategoryModel("Animais", null))
        categories.add(CategoryModel("Papelaria e Brinquedos", null))

        return categories

    }

    fun getItems(category: String) : ArrayList<CategoryModel>{

        val items = ArrayList<CategoryModel>()

        when(category){

            "Fruta e Legumes" -> {

                items.add(CategoryModel("Banana", null))
                items.add(CategoryModel("Maça", null))
                items.add(CategoryModel("Pêssego", null))

            }

            "Bebidas" -> {

                items.add(CategoryModel("Coca-Cola", null))
                items.add(CategoryModel("Água", null))
                items.add(CategoryModel("Iced Tea", null))

            }

            "Refeições Prontas" -> {

                items.add(CategoryModel("Frango Assado", null))
                items.add(CategoryModel("Massa Esparguete", null))

            }

        }

        return items

    }

}