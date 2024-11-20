package com.chapman.ecommerce_backend.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class HomePageDTO {
    private List<?> featuredProducts = new ArrayList<>();
    private List<?> topCategories = new ArrayList<>();
    private List<?> activePromotions = new ArrayList<>();

    public void setFeaturedProducts(List<?> featuredProducts) {
        this.featuredProducts = featuredProducts;
    }

    public void setTopCategories(List<?> topCategories) {
        this.topCategories = topCategories;
    }

    public void setActivePromotions(List<?> activePromotions) {
        this.activePromotions = activePromotions;
    }

    public static HomePageDTOBuilder builder() {
        return new HomePageDTOBuilder();
    }

    public static class HomePageDTOBuilder {
        private List<?> featuredProducts = new ArrayList<>();
        private List<?> topCategories = new ArrayList<>();
        private List<?> activePromotions = new ArrayList<>();

        public HomePageDTOBuilder featuredProducts(List<?> featuredProducts) {
            this.featuredProducts = featuredProducts;
            return this;
        }

        public HomePageDTOBuilder topCategories(List<?> topCategories) {
            this.topCategories = topCategories;
            return this;
        }

        public HomePageDTOBuilder activePromotions(List<?> activePromotions) {
            this.activePromotions = activePromotions;
            return this;
        }

        public HomePageDTO build() {
            HomePageDTO dto = new HomePageDTO();
            dto.setFeaturedProducts(this.featuredProducts);
            dto.setTopCategories(this.topCategories);
            dto.setActivePromotions(this.activePromotions);
            return dto;
        }
    }
}
