package com.chapman.ecommerce_backend.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chapman.ecommerce_backend.entity.Category;

@Repository
public interface CategoryRespository extends JpaRepository<Category, Long> {

    Category findByName(String name);

}
