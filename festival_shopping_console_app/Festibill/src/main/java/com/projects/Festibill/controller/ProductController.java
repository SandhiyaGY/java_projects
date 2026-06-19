package com.projects.Festibill.controller;

import com.projects.Festibill.entity.Product;
import com.projects.Festibill.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository repository;

    @PostMapping
    public Product save(
            @RequestBody Product product){

        return repository.save(product);
    }

    @GetMapping
    public List<Product> getAll(){

        return repository.findAll();
    }
}