package com.chapman.ecommerce_backend.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.chapman.ecommerce_backend.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

    @Query("SELECT c FROM Category c ORDER BY c.name DESC") // Adjust query as needed
    List<Category> findTopCategories(Pageable pageable);

}
