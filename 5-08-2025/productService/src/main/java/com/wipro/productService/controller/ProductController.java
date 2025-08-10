package com.wipro.productService.controller;

import com.wipro.productService.dto.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return new Product(id, "Samsung Galaxy", 29999.99); // dummy data
    }
}
