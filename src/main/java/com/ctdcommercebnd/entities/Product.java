package com.ctdcommercebnd.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    private String name;
    private Double value;
    private String description;
    private String synopsis;
    private String image;

    private Integer fkcategory;

    @ManyToOne @JoinColumn(name = "fkcategory", insertable = false, updatable = false)
    @JsonIgnoreProperties("productList")
    private Category category;
}