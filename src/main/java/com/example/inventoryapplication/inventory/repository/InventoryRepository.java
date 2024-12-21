package com.example.inventoryapplication.inventory.repository;

import com.example.inventoryapplication.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByQuantityLessThan(int threshold);
}
