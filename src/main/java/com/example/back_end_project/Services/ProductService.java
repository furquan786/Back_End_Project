package com.example.back_end_project.Services;

import com.example.back_end_project.DTOs.ProductDTO;
import org.springframework.web.bind.annotation.*;

public interface ProductService {

    String getAllProduct();


    String getSingleProduct( Long product_id);


    String addNewProduct( ProductDTO productDTO);


    String updateProduct(Long product_id,  ProductDTO productDTO);

    String deleteProduct( Long product_id);
}
