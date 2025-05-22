package com.myproject.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private long id;
    private String title;
    private double price;
    private String description;
    private String category;
}
