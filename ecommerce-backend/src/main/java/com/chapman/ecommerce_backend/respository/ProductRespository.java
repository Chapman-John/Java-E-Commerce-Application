package com.chapman.ecommerce_backend.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import com.chapman.ecommerce_backend.dto.ProductDTO;
import com.chapman.ecommerce_backend.entity.Product;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {

}
