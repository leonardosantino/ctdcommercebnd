package com.ctdcommercebnd.service;

import com.ctdcommercebnd.entities.Product;
import com.ctdcommercebnd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // Create product
    public Product save(Product product){
        return repository.save(product);
    }
    // Get product by Id
    public Product getById(Integer id){
        return repository.getById(id);
    }
    // Get all products
    public List<Product> findAll(){
        return repository.findAll();
    }

    public String deleteById(Integer idProduct){
        repository.deleteById(idProduct);
        return idProduct + " Product deleted !";
    }
}
