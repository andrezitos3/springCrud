package com.example.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.domain.product.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;
    
    @SuppressWarnings("rawtypes")
    @GetMapping
    public ResponseEntity getAllProducts(){

        var allProducts = repository.findAll();

        return ResponseEntity.ok(allProducts);
    }
}
