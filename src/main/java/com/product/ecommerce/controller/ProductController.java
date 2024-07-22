package com.product.ecommerce.controller;

import com.product.ecommerce.DTO.GetProductDTO;
import com.product.ecommerce.exceptions.NotFoundException;
import com.product.ecommerce.model.ProductModel;
import com.product.ecommerce.service.ProductService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Getter
@Setter
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/{id}")
    public @ResponseBody GetProductDTO getProduct(@PathVariable("id") long id) throws Exception{
        return productService.getProductByID(id);

    }

    @PostMapping("")
    public String createProduct(@RequestBody ProductModel productModel){
       System.out.println(productModel.getName());
       System.out.println(productModel.getPrice());
        return "Product Created";
    }

}
