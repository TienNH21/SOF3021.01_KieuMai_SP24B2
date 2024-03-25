package com.example.demo.repositories;

import com.example.demo.entities.SanPhamChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamChiTietRepository
    extends JpaRepository<SanPhamChiTiet, Integer> {
}
