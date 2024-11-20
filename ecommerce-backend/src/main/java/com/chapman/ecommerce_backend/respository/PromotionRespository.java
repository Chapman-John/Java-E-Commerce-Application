package com.chapman.ecommerce_backend.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chapman.ecommerce_backend.entity.Promotion;

@Repository
public interface PromotionRespository extends JpaRepository<Promotion, Long> {

}
