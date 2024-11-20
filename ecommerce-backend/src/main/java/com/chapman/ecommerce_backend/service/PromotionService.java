package com.chapman.ecommerce_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.PromotionDTO;

@Service
public class PromotionService {

    private final PromotionService promotionService;

    public PromotionService(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    public List<PromotionDTO> getActivePromotions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getActivePromotions'");
    }

}
