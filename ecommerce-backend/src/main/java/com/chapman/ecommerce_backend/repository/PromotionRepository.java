package com.chapman.ecommerce_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.chapman.ecommerce_backend.entity.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {

    @Query("SELECT p FROM Promotion p WHERE p.start_date <= LocalDate AND p.end_date >= LocalDate")
    List<Promotion> findActivePromotions();

}
