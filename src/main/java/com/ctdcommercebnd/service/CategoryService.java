package com.ctdcommercebnd.service;

import com.ctdcommercebnd.entities.Category;
import com.ctdcommercebnd.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category save(Category category){
        return repository.save(category);
    }

    public Category getById(Integer idCategory){
        return repository.getById(idCategory);
    }

    public List<Category> findAll(){
        return repository.findAll();
    }

    public String deleteById(Integer idCategory){
        repository.deleteById(idCategory);
        return idCategory + " Category deleted !";
    }
}