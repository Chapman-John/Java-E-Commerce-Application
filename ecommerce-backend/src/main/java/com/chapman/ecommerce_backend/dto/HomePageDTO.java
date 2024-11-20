package com.chapman.ecommerce_backend.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class HomePageDTO {
    private List<ProductDTO> featuredProducts;
    private List<CategoryDTO> topCategories;
    private List<PromotionDTO> activePromotions;
}

// package com.chapman.ecommerce_backend.dto;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import java.util.ArrayList;
// import java.util.List;

// @Data
// @Builder
// @AllArgsConstructor
// public class HomePageDTO {
// @Builder.Default
// private List<?> featuredProducts = new ArrayList<>();

// @Builder.Default
// private List<?> topCategories = new ArrayList<>();

// @Builder.Default
// private List<?> activePromotions = new ArrayList<>();

// public HomePageDTO() {
// }
// }

// package com.chapman.ecommerce_backend.dto;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// import java.util.List;

// @Data
// @Builder
// @NoArgsConstructor
// @AllArgsConstructor
// public class HomePageDTO {
// private List<?> featuredProducts;
// private List<?> topCategories;
// private List<?> activePromotions;
// }

// package com.chapman.ecommerce_backend.dto;

// import lombok.Builder;
// import lombok.Data;
// import java.util.List;

// @Data
// @Builder
// public class HomePageDTO {
// private List<?> featuredProducts; // Use appropriate type
// private List<?> topCategories; // Use appropriate type
// private List<?> activePromotions; // Use appropriate type
// }

// package com.chapman.ecommerce_backend.dto;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// import java.util.List;

// @Data
// @Builder
// @NoArgsConstructor
// @AllArgsConstructor
// public class HomePageDTO {
// private List<?> featuredProducts;
// private List<?> topCategories;
// private List<?> activePromotions;
// }

// package com.chapman.ecommerce_backend.dto;

// import lombok.Data;
// import java.util.List;

// @Data
// public class HomePageDTO {
// private List<?> featuredProducts;
// private List<?> topCategories;
// private List<?> activePromotions;

// // Manual builder pattern
// public static HomePageDTOBuilder builder() {
// return new HomePageDTOBuilder();
// }

// public static class HomePageDTOBuilder {
// private HomePageDTO dto = new HomePageDTO();

// public HomePageDTOBuilder featuredProducts(List<?> products) {
// dto.setFeaturedProducts(products);
// return this;
// }

// public HomePageDTOBuilder topCategories(List<?> categories) {
// dto.setTopCategories(categories);
// return this;
// }

// public HomePageDTOBuilder activePromotions(List<?> promotions) {
// dto.setActivePromotions(promotions);
// return this;
// }

// public HomePageDTO build() {
// return dto;
// }
// }
// }

// package com.chapman.ecommerce_backend.dto;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// import java.util.ArrayList;
// import java.util.List;

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// public class HomePageDTO {
// private List<?> featuredProducts = new ArrayList<>();
// private List<?> topCategories = new ArrayList<>();
// private List<?> activePromotions = new ArrayList<>();

// public static HomePageDTOBuilder builder() {
// return new HomePageDTOBuilder();
// }

// public static class HomePageDTOBuilder {
// private List<?> featuredProducts = new ArrayList<>();
// private List<?> topCategories = new ArrayList<>();
// private List<?> activePromotions = new ArrayList<>();

// public HomePageDTOBuilder featuredProducts(List<?> featuredProducts) {
// this.featuredProducts = featuredProducts;
// return this;
// }

// public HomePageDTOBuilder topCategories(List<?> topCategories) {
// this.topCategories = topCategories;
// return this;
// }

// public HomePageDTOBuilder activePromotions(List<?> activePromotions) {
// this.activePromotions = activePromotions;
// return this;
// }

// public HomePageDTO build() {
// return new HomePageDTO(featuredProducts, topCategories, activePromotions);
// }
// }
// }
