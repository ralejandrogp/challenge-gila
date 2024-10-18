package com.example.challenge.controller;

import com.example.challenge.controller.dto.CategoryDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("/all")
    public List<CategoryDTO> getCategoryAll() {

        //TODO retrieve all the categories from the table

        UUID uuid = UUID.randomUUID();

        return List.of(
                CategoryDTO.builder().categoryGuid(UUID.randomUUID().toString()).name("Sports").build(),
                CategoryDTO.builder().categoryGuid(UUID.randomUUID().toString()).name("Finance").build(),
                CategoryDTO.builder().categoryGuid(UUID.randomUUID().toString()).name("Movies").build()
        );
    }
}
