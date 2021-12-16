package com.ctdcommercebnd.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategory;

    @Column(length = 20, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Product> productList;
}