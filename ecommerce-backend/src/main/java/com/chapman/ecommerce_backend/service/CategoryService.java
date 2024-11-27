package com.chapman.ecommerce_backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.CategoryDTO;
import com.chapman.ecommerce_backend.entity.Category;
import com.chapman.ecommerce_backend.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // public List<CategoryDTO> getTopCategories(int limit) {
    // List<Category> categories =
    // categoryRepository.findTopCategories(PageRequest.of(0, limit)); // Adjust
    // based on
    // // your repository
    // // method
    // return categories.stream()
    // .map(category -> new CategoryDTO(category.getName())) // Map to DTO if
    // necessary
    // .collect(Collectors.toList());
    // }

    // public List<CategoryDTO> getTopCategories(int limit) {
    // List<Category> categories =
    // categoryRepository.findTopCategories(PageRequest.of(0, limit)); // Adjust
    // based on
    // // your repository
    // // method
    // return categories.stream()
    // .map(category -> new CategoryDTO(category.getId(), category.getName(),
    // category.getImageUrl())) // Map
    // // to
    // // DTO
    // // if
    // // necessary
    // .collect(Collectors.toList());
    // }

    // public List<CategoryDTO> getTopCategories(int limit) {
    // List<Category> categories =
    // categoryRepository.findTopCategories(PageRequest.of(0, limit));
    // return categories.stream()
    // .map(category -> new CategoryDTO(category.getId(), category.getName(),
    // category.getImageUrl()))
    // .collect(Collectors.toList());
    // }

    public List<CategoryDTO> getTopCategories(int limit) {
        List<Category> categories = categoryRepository.findTopCategories(PageRequest.of(0, limit));
        return categories.stream()
                .map(category -> new CategoryDTO(category.getId(), category.getName(), category.getImageUrl()))
                .collect(Collectors.toList());
    }
}
