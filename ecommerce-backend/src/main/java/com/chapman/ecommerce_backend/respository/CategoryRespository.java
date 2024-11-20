package com.chapman.ecommerce_backend.respository;

import com.chapman.ecommerce_backend.dto.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRespository extends JpaRepository<CategoryDTO, Long> {

    CategoryDTO findByName(String name);

}
