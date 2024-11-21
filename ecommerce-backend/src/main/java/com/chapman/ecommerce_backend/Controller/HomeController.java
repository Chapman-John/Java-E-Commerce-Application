package com.chapman.ecommerce_backend.controller;

import com.chapman.ecommerce_backend.dto.HomePageDTO;
import com.chapman.ecommerce_backend.service.CategoryService;
import com.chapman.ecommerce_backend.service.ProductService;
import com.chapman.ecommerce_backend.service.PromotionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {
    private final ProductService productService;
    private final CategoryService categoryService;
    private final PromotionService promotionService;

    public HomeController(ProductService productService, CategoryService categoryService,
            PromotionService promotionService) {
        this.productService = productService;
        this.categoryService = categoryService;
        this.promotionService = promotionService;
    }

    @GetMapping
    public ResponseEntity<HomePageDTO> getHomePageData(
            @RequestParam(defaultValue = "6") int featuredProductsLimit,
            @RequestParam(defaultValue = "4") int topCategoriesLimit) {

        HomePageDTO homePageData = HomePageDTO.builder()
                .featuredProducts(productService.getFeaturedProducts(featuredProductsLimit))
                .topCategories(categoryService.getTopCategories(topCategoriesLimit))
                .activePromotions(promotionService.getActivePromotions())
                .build();

        return ResponseEntity.ok(homePageData);
    }
}
