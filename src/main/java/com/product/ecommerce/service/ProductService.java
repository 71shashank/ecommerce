package com.product.ecommerce.service;

import com.product.ecommerce.DTO.GetProductDTO;
import com.product.ecommerce.model.ProductModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
    public GetProductDTO getProductByID(long id){
        RestTemplate restTemplate=new RestTemplate();
        String url= "https://fakestoreapi.com/products/"+id;
        ProductModel productModel= restTemplate.getForObject(url,ProductModel.class);
        System.out.print(productModel);

        GetProductDTO obj=new GetProductDTO();
        obj.setImageURL(productModel.getImageURL());
        obj.setName(productModel.getName());
        obj.setPrice(productModel.getPrice());
        return obj;

    }
}