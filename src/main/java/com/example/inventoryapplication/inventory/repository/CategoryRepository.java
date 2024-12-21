package com.example.inventoryapplication.inventory.repository;

import com.example.inventoryapplication.inventory.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
