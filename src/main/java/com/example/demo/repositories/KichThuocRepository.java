package com.example.demo.repositories;

import com.example.demo.entities.KichThuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KichThuocRepository
    extends JpaRepository<KichThuoc, Integer> {
}
