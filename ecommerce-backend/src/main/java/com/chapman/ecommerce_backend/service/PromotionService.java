package com.chapman.ecommerce_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.PromotionDTO;
import com.chapman.ecommerce_backend.repository.PromotionRepository;

@Service
public class PromotionService {

    @Autowired
    private final PromotionRepository promotionRepository;

    public PromotionService(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public List<PromotionDTO> getActivePromotions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getActivePromotions'");
    }

}
