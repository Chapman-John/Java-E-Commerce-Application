package com.chapman.ecommerce_backend.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.ProductDTO;
import com.chapman.ecommerce_backend.entity.Product;
import com.chapman.ecommerce_backend.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // public List<ProductDTO> getFeaturedProducts(int featuredProductsLimit) {
    // Pageable pageable = PageRequest.of(0, featuredProductsLimit);
    // List<Product> featuredProducts =
    // productRepository.findByFeaturedTrue(pageable).getContent();

    // return featuredProducts.stream()
    // .map(this::convertToDTO)
    // .collect(Collectors.toList());
    // }

    public List<ProductDTO> getFeaturedProducts() {
        return productRepository.findByFeaturedTrue().stream()
                .map(product -> new ProductDTO(product.getId(), product.getName(), product.getDescription(),
                        product.getPrice(), product.getImageUrl(), product.getQuantity(), product.isFeatured()))
                .collect(Collectors.toList());
    }

    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public boolean createFeaturedProduct(ProductDTO productDTO) {
        Product product = new Product(
                productDTO.getId(),
                productDTO.getName(),
                productDTO.getDescription(),
                productDTO.getPrice(),
                productDTO.getImageUrl(),
                productDTO.getQuantity(),
                productDTO.isFeatured());
        productRepository.save(product);
        return true;
    }

    public boolean updateFeaturedProduct(ProductDTO productDTO) {
        // Find the existing product
        Optional<Product> existingProduct = productRepository.findById(productDTO.getId());

        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();

            // Update the product fields
            product.setName(productDTO.getName());
            product.setDescription(productDTO.getDescription());
            product.setPrice(productDTO.getPrice());
            product.setFeatured(true); // Ensure it's set as featured
            // Update other fields as necessary

            // Save the updated product
            productRepository.save(product);
            return true;
        } else {
            // Product not found
            return false;
        }
    }

    private ProductDTO convertToDTO(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getImageUrl(),
                product.getQuantity(),
                product.isFeatured());
    }
}
