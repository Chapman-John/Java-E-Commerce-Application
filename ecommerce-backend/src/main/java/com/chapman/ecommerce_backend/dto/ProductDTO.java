package com.chapman.ecommerce_backend.dto;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private double price;
    private int quantity;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, String imageUrl, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.quantity = quantity;
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

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
