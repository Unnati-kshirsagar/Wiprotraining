package com.wipro.productmanagement.repository;

import com.wipro.productmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    // Derived query
    List<Product> findByProductMake(String productMake);
}