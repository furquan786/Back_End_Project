package com.example.back_end_project.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Products extends BaseModel{

    private String title;
    private String price;
    private String category;
    private String image;
    private String description;
}
