package com.chapman.ecommerce_backend.service;

import java.util.List;
import java.util.stream.Collectors;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.ProductDTO;
import com.chapman.ecommerce_backend.entity.Product;
import com.chapman.ecommerce_backend.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getFeaturedProducts(int featuredProductsLimit) {
        List<Product> featuredProducts = productRepository.findFeaturedProducts(featuredProductsLimit);
        return featuredProducts.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ProductDTO convertToDTO(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getImageUrl());
    }
}
