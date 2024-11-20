package com.chapman.ecommerce_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.CategoryDTO;
import com.chapman.ecommerce_backend.respository.CategoryRespository;

@Service
public class CategoryService {

    private final CategoryRespository categoryRepository;

    public CategoryService(CategoryRespository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDTO> getTopCategories(int topCategoriesLimit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTopCategories'");
    }

}
