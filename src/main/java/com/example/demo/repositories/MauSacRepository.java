package com.example.demo.repositories;

import com.example.demo.entities.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MauSacRepository
    extends JpaRepository<MauSac, Integer> {
}
