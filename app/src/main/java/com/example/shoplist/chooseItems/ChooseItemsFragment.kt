package com.example.shoplist.chooseItems

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shoplist.RowConfigurations.CategoryAdapter
import com.example.shoplist.Utils.UtilsFunctions
import com.example.shoplist.databinding.FragmentChooseItemsBinding

class ChooseItemsFragment : Fragment() {

    lateinit var binding: FragmentChooseItemsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentChooseItemsBinding.inflate(layoutInflater)

        binding.recyclerViewCategories.layoutManager = GridLayoutManager(requireContext(), 3)

        val categories = UtilsFunctions().getCategories()

        var adapter = CategoryAdapter(categories)

        binding.recyclerViewCategories.adapter = adapter

        adapter.setOnItemClickListener(object : CategoryAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                val items = UtilsFunctions().getItems(categories[position].name!!)

                adapter.clear()

                adapter.addItems(items)

            }
        })

        return binding.root
    }
}