package com.product.ecommerce.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ProductModel {
    private long id;
    private String description;
    private double price;
    private String imageURL;
    private String name;
    private String category;

}
