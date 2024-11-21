package com.chapman.ecommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chapman.ecommerce_backend.entity.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {

}
