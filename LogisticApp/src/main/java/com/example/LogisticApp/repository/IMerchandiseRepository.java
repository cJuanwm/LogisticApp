package com.example.LogisticApp.repository;

import com.example.LogisticApp.models.Merchandise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMerchandiseRepository extends JpaRepository<Integer, Merchandise> {
}
