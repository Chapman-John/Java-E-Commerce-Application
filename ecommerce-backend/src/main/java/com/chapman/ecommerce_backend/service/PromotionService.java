package com.chapman.ecommerce_backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.PromotionDTO;
import com.chapman.ecommerce_backend.entity.Promotion;
import com.chapman.ecommerce_backend.repository.PromotionRepository;

@Service
public class PromotionService {

    @Autowired
    private final PromotionRepository promotionRepository;

    public PromotionService(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    // public List<PromotionDTO> getActivePromotions() {
    // List<Promotion> promotions = promotionRepository.findActivePromotions();
    // return promotions.stream()
    // .map(promotion -> new PromotionDTO(promotion.getId(), promotion.getName(),
    // promotion.getDescription(),
    // promotion.getImageUrl(), promotion.getDiscount(), promotion.getCode(),
    // promotion.getStartDate(),
    // promotion.getEndDate()))
    // .collect(Collectors.toList());
    // }

    public List<PromotionDTO> getActivePromotions() {
        List<Promotion> promotions = promotionRepository.findActivePromotions();
        return promotions.stream()
                .map(promotion -> new PromotionDTO(promotion.getId(), promotion.getName(), promotion.getDescription(),
                        promotion.getImageUrl(), promotion.getDiscount(), promotion.getCode(), promotion.getStartDate(),
                        promotion.getEndDate()))
                .collect(Collectors.toList());
    }

}
