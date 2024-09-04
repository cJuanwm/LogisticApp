package com.example.LogisticApp.repository;

import com.example.LogisticApp.models.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWarehouseRepository extends JpaRepository<Integer, Warehouse> {
}
