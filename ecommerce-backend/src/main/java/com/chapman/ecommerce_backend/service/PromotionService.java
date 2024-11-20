package com.chapman.ecommerce_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapman.ecommerce_backend.dto.PromotionDTO;
import com.chapman.ecommerce_backend.respository.PromotionRespository;

@Service
public class PromotionService {

    @Autowired
    private final PromotionRespository promotionRespository;

    public PromotionService(PromotionRespository promotionRespository) {
        this.promotionRespository = promotionRespository;
    }

    public List<PromotionDTO> getActivePromotions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getActivePromotions'");
    }

}
