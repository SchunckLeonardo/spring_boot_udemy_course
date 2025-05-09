package com.github.productsapi.controller

import com.github.productsapi.model.Product
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController {

    @PostMapping
    fun save(
        @RequestBody product: Product
    ) {
        println("Product saved ${product.toString()}")
    }

}