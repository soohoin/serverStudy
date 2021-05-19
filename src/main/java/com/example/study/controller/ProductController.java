package com.example.study.controller;

import java.util.List;

import com.example.study.model.Product;
import com.example.study.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
    

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/product")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @RequestMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }
}
