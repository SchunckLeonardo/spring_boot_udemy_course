package com.github.productsapi.controller

import com.github.productsapi.model.Product
import com.github.productsapi.repository.ProductRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/products")
class ProductController(
    private val productRepository: ProductRepository
) {
    @PostMapping
    fun save(
        @RequestBody product: Product
    ): Product {
        val id = UUID.randomUUID().toString()
        product.id = id
        productRepository.save(product)

        return product
    }

}