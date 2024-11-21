package com.chapman.ecommerce_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import com.chapman.ecommerce_backend.dto.ProductDTO;
import com.chapman.ecommerce_backend.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findFeaturedProducts(int limit);

}
