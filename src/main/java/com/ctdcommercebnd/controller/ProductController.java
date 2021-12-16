package com.ctdcommercebnd.controller;

import com.ctdcommercebnd.entities.Product;
import com.ctdcommercebnd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.ok(service.save(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Integer id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id){
        return ResponseEntity.ok(service.deleteById(id));
    }
}