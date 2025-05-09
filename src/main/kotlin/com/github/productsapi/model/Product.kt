package com.github.productsapi.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "products")
class Product {

    @Id
    @Column(name = "id")
    var id: String = ""

    @Column(name = "name")
    val name: String = ""

    @Column(name = "description")
    val description: String = ""

    @Column(name = "price")
    val price: Double = 0.0

    override fun toString(): String {
        return "Product(id='$id', name='$name', description='$description', price=$price)"
    }
}