package com.chapman.ecommerce_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.ProductDTO;
import com.chapman.ecommerce_backend.respository.ProductRespository;

@Service
public class ProductService {

    private final ProductRespository productRepository;

    public ProductService(ProductRespository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getFeaturedProducts(int featuredProductsLimit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFeaturedProducts'");
    }

}
