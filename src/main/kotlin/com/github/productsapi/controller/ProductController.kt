package com.github.productsapi.controller

import com.github.productsapi.model.Product
import com.github.productsapi.repository.ProductRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.Optional
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

    @GetMapping("/{id}")
    fun getById(
        @PathVariable id: String
    ): Product {
        return productRepository
            .findById(id)
            .orElse(null)
    }

    @DeleteMapping("/{id}")
    fun delete(
        @PathVariable id: String
    ) {
        productRepository.deleteById(id)
    }

    @PutMapping("/{id}")
    fun update(
        @PathVariable id: String,
        @RequestBody product: Product
    ) {
        product.id = id
        productRepository.save(product)
    }

    @GetMapping
    fun search(
        @RequestParam(name = "name") name: String
    ): List<Product> {
        return productRepository.findByName(name)
    }

}