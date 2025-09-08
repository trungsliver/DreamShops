package com.gtel.dream_shops.repository;

import com.gtel.dream_shops.model.Category;
import com.gtel.dream_shops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByCategoryName(String category);
    
    List<Product> findByBrand(String brand);
    
    List<Product> findByCategoryAndBrand(Category category, String brandName);

    List<Product> findByName(String name);

    List<Product> findByBrandAndName(String brand, String name);

    Long countByBrandAndName(String brand, String name);

    boolean existsByNameAndBrand(String name, String brand);
}
