package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class SanPham {
    private int id;
    private String ma;
    private String ten;
    private int trangThai;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Ma", nullable = false, length = 255)
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Basic
    @Column(name = "Ten", nullable = false, length = 255)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "TrangThai", nullable = false)
    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanPham sanPham = (SanPham) o;
        return id == sanPham.id && trangThai == sanPham.trangThai && Objects.equals(ma, sanPham.ma) && Objects.equals(ten, sanPham.ten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ma, ten, trangThai);
    }
}
