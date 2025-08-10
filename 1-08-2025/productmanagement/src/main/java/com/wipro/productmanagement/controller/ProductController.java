package com.wipro.productmanagement.controller;

import com.wipro.productmanagement.model.Product;
import com.wipro.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.data.domain.Page;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // Read all
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Read by ID
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.getProductById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product with ID " + id + " deleted.";
    }

    // Derived Query: Get by Make
 
    
    @GetMapping("/page")
    public Page<Product> getPagedProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "productPrice") String sortBy,
            @RequestParam(defaultValue = "asc") String direction
    ) {
        return productService.getProductsWithPaginationAndSort(page, size, sortBy, direction);
    }

}
