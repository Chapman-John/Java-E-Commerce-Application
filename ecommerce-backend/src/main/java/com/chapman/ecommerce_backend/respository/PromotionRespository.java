package com.chapman.ecommerce_backend.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chapman.ecommerce_backend.dto.PromotionDTO;

public interface PromotionRespository extends JpaRepository<PromotionDTO, Long> {

}
