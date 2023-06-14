package com.example.springbootcrudex1.repository;

import com.example.springbootcrudex1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    Product findById(int id);
}
