package com.chapman.ecommerce_backend.controller;

import com.chapman.ecommerce_backend.dto.HomePageDTO;
import com.chapman.ecommerce_backend.dto.ProductDTO;
import com.chapman.ecommerce_backend.service.CategoryService;
import com.chapman.ecommerce_backend.service.ProductService;
import com.chapman.ecommerce_backend.service.PromotionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
@CrossOrigin(origins = "http://localhost:3000", methods = { RequestMethod.GET, RequestMethod.POST })
public class HomeController {

    @Autowired
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

    @PostMapping("/products")
    public ResponseEntity<String> createFeaturedProduct(@RequestBody ProductDTO productDTO) {
        // Call a service method to save the product
        boolean isCreated = productService.createFeaturedProduct(productDTO);

        if (isCreated) {
            return ResponseEntity.ok("Product created successfully.");
        } else {
            return ResponseEntity.status(500).body("Failed to create product.");
        }
    }

    @PutMapping("/products")
    public ResponseEntity<String> updateFeaturedProduct(@RequestBody ProductDTO productDTO) {
        // Call a service method to update the product
        boolean isUpdated = productService.updateFeaturedProduct(productDTO);

        if (isUpdated) {
            return ResponseEntity.ok("Product updated successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Failed to update product. Product not found.");
        }
    }

}
