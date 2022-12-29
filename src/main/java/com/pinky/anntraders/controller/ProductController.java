package com.pinky.anntraders.controller;

import com.pinky.anntraders.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pinky.anntraders.requestmodels.AddProductRequest;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //build create product REST API
    @PostMapping("/add")
    public void postProduct(@RequestBody AddProductRequest addProductRequest){
        productService.postProduct(addProductRequest);
    }

}

