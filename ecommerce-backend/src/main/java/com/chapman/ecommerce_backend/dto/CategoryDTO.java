package com.chapman.ecommerce_backend.dto;

public class CategoryDTO {

    private Long id;
    private String name;
    private String imageUrl;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name, String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
