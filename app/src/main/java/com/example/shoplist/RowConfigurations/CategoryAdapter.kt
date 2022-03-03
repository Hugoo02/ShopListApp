package com.example.shoplist.RowConfigurations

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.shoplist.Models.CategoryModel
import com.example.shoplist.R

class CategoryAdapter(private val categories: ArrayList<CategoryModel>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{

        fun onItemClick(position: Int)

    }

    fun setOnItemClickListener(listener: onItemClickListener){

        mListener = listener

    }

    fun clear(){

        categories.clear()
        notifyDataSetChanged()

    }

    fun addItem(item: CategoryModel){

        categories.add(item)
        notifyDataSetChanged()

    }

    fun addItems(items: ArrayList<CategoryModel>){

        categories.addAll(items)
        notifyDataSetChanged()

    }

    class ViewHolder(view: View, listener: onItemClickListener) : RecyclerView.ViewHolder(view) {
        var textViewCategory: TextView
        var imageViewCategory: ImageView

        init {
            // Define click listener for the ViewHolder's View.
            textViewCategory = view.findViewById(R.id.textViewCategory)
            imageViewCategory = view.findViewById(R.id.imageViewCategory)

            view.setOnClickListener{

                listener.onItemClick(adapterPosition)

            }
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.row_choose_categories, viewGroup, false)

        return ViewHolder(view, mListener)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.textViewCategory.text = categories[position].name
        if(categories[position].photo != null)
            viewHolder.imageViewCategory.setBackgroundResource(categories[position].photo!!)
    }

    override fun getItemCount() = categories.size

}