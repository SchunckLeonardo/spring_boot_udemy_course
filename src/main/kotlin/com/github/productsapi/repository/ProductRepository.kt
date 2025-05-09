package com.github.productsapi.repository

import com.github.productsapi.model.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}