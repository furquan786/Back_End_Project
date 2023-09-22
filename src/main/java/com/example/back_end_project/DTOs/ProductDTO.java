package com.example.back_end_project.DTOs;

import com.example.back_end_project.Models.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO  {
    private String title;
    private String price;
    private String category;
    private String image;
    private String description;
}
