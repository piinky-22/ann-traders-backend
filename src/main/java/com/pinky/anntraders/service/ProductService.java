package com.pinky.anntraders.service;

import com.pinky.anntraders.dao.ProductRepository;
import com.pinky.anntraders.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pinky.anntraders.requestmodels.AddProductRequest;


@Service
@Transactional
public class ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){

        this.productRepository = productRepository;
    }

    public void postProduct(AddProductRequest addProductRequest) {
        Product product = new Product();
        product.setTitle(addProductRequest.getTitle());
        product.setSeller(addProductRequest.getSeller());
        product.setDescription(addProductRequest.getDescription());
        product.setCategory(addProductRequest.getCategory());
        product.setImg(addProductRequest.getImg());
        product.setPrice(addProductRequest.getPrice());
        productRepository.save(product);
    }
}
