package com.example.LogisticApp.repository;

import com.example.LogisticApp.models.ZoneWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IZoneWareHouseRepository extends JpaRepository<Integer, ZoneWarehouse> {
}
