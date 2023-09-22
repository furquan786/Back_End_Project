package com.example.back_end_project.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.List;

@Getter
@Setter
public class Categories extends  BaseModel{

    private String name;
    private String description;
    private List<Products> products;
}
