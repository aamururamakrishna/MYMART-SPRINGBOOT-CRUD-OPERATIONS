package com.example.mymart.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mymart.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
