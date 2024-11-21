// package com.chapman.ecommerce_backend.dto;

// public class ProductDTO {

//     private Long id;
//     private String name;
//     private String description;
//     private String imageUrl;
//     private double price;
//     private int quantity;

//     public ProductDTO() {
//     }

//     public ProductDTO(Long id, String name, String description, String imageUrl, double price, int quantity) {
//         this.id = id;
//         this.name = name;
//         this.description = description;
//         this.imageUrl = imageUrl;
//         this.price = price;
//         this.quantity = quantity;
//     }

//     public Long getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public String getImageUrl() {
//         return imageUrl;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public int getQuantity() {
//         return quantity;
//     }

// }

package com.chapman.ecommerce_backend.dto;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;

    // Constructors
    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
