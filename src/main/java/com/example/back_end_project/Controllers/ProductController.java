package com.example.back_end_project.Controllers;

import com.example.back_end_project.DTOs.ProductDTO;
import com.example.back_end_project.Services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;

    ProductController(ProductService productService)
    {
        this.productService = productService;
    }


    @GetMapping("/products")
    public String getAllProduct()
    {
        return "Getting all the products";
    }


    @GetMapping("/products/{productid}")
    public String getSingleProduct(@PathVariable("productid") Long product_id)
    {
        return "Getting single product with id: " + product_id;
    }


    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDTO productDTO)
    {
        return "Adding a new Product Successfully  " + productDTO;
    }

    @PutMapping("/products/{productid}")
    public String updateProduct(@PathVariable("productid") Long product_id, @RequestBody ProductDTO productDTO)
    {
        return "Updating the product successfully with id: "+product_id + productDTO;
    }

    @DeleteMapping("/products/{productid}")
    public String deleteProduct(@PathVariable("productid") Long product_id)
    {
        return "Deleting the product with id: " +product_id ;
    }
}
