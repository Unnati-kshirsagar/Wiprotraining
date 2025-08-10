package com.wipro.productmanagement.service;
import com.wipro.productmanagement.model.Product;
import com.wipro.productmanagement.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    // Create
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }
    public Page<Product> getProductsWithPaginationAndSort(int page, int size, String sortBy, String direction) {
        // Choose ascending or descending
        Sort sort = direction.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();

        // Create a pageable object
        Pageable pageable = PageRequest.of(page, size, sort);

        // Use built-in repository method
        return productRepo.findAll(pageable);
    }


    // Read all
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    // Read by ID
    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    // Update
    public Product updateProduct(int id, Product product) {
        Product existing = productRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setProductName(product.getProductName());
            existing.setProductMake(product.getProductMake());
            existing.setProductPrice(product.getProductPrice());
            return productRepo.save(existing);
        }
        return null;
    }

    // Delete
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    // Derived Query: Find by Make
    public List<Product> getProductsByMake(String productMake) {
        return productRepo.findByProductMake(productMake);
    }
}