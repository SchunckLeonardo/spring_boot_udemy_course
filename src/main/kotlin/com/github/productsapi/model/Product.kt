package com.github.productsapi.model

class Product {
    val id: String = ""
    val name: String = ""
    val description: String = ""
    val price: Double = 0.0

    override fun toString(): String {
        return "Product(id='$id', name='$name', description='$description', price=$price)"
    }
}