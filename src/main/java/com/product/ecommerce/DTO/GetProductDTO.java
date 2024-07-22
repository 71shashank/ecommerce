package com.product.ecommerce.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetProductDTO {
    private String name;
    private String imageURL;
    private double price;

}
