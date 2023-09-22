package com.example.back_end_project.Services;

import com.example.back_end_project.DTOs.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductImpl implements ProductService{
    @Override
    public String getAllProduct() {
        return null;
    }

    @Override
    public String getSingleProduct(Long product_id) {
        return null;
    }

    @Override
    public String addNewProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public String updateProduct(Long product_id, ProductDTO productDTO) {
        return null;
    }

    @Override
    public String deleteProduct(Long product_id) {
        return null;
    }
}
