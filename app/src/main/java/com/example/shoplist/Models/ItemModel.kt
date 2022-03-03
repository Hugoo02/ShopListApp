package com.example.shoplist.Models

class ItemModel(
    var name: String? = null,
    var photo: Int? = null){

    constructor() : this(null, null)

    fun toHashMap() : HashMap<String, Any?>{
        val hashMap = HashMap<String, Any?>()
        hashMap["name"]             = name
        hashMap["photo"]            = photo

        return hashMap
    }
    companion object{
        fun fromHash(hashMap:  HashMap<String, Any?>) : CategoryModel {
            val item = CategoryModel(
                hashMap["name"].toString(),
                hashMap["photo"] as Int
            )
            return item
        }
    }

}