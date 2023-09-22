package com.example.back_end_project.Services;

import org.springframework.stereotype.Service;

@Service
public class FakeStoreCategoryImpl implements CategoryService{
    @Override
    public String getAllCategory() {
        return null;
    }

    @Override
    public String getProductInCategory(Long categoryId) {
        return null;
    }
}
