package com.example.back_end_project.Controllers;

import com.example.back_end_project.Services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/categories")
@RestController
public class CategoryController {

    private CategoryService categoryService;

    CategoryController(CategoryService categoryService)
    {
        this.categoryService = categoryService;
    }


    @GetMapping
    public String getAllCategory()
    {
        return "Getting all the category";
    }
    @GetMapping("/{categoryId}")
    public String getProductInCategory(@PathVariable("categoryId") Long categoryId)
    {
        return "get the product by categoryId "+categoryId;
    }
}
