package com.pinky.anntraders.requestmodels;

import lombok.Data;

@Data
public class AddProductRequest {
    private String title;
    private String seller;
    private String description;
    private String category;
    private String img;
    private int price;
}
