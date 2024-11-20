package com.chapman.ecommerce_backend.dto;

public class PromotionDTO {

    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private double discount;
    private String code;

    public PromotionDTO() {
    }

    public PromotionDTO(Long id, String name, String description, String imageUrl, double discount, String code) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.discount = discount;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getDiscount() {
        return discount;
    }

    public String getCode() {
        return code;
    }
}
