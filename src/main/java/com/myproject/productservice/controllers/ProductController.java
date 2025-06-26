package com.myproject.productservice.controllers;

import com.myproject.productservice.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Products")
public class ProductController {
    @GetMapping("/allProducts")
    public List<Product> getAllProducts() {
        return null;
    }

    @GetMapping("/product/id")
    public Product getSingleProduct(@PathVariable Long id) {
        return null;
    }
}
