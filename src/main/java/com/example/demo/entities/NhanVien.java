package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class NhanVien {
    private Integer id;
    private String ten;
    private String ma;
    private String tenDangNhap;
    private String matKhau;
    private Integer trangThai;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "Ma", nullable = false, length = 255)
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Basic
    @Column(name = "TenDangNhap", nullable = false, length = 255)
    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    @Basic
    @Column(name = "MatKhau", nullable = false, length = 255)
    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Basic
    @Column(name = "TrangThai", nullable = true)
    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanVien nhanVien = (NhanVien) o;
        return Objects.equals(id, nhanVien.id) && Objects.equals(ten, nhanVien.ten) && Objects.equals(ma, nhanVien.ma) && Objects.equals(tenDangNhap, nhanVien.tenDangNhap) && Objects.equals(matKhau, nhanVien.matKhau) && Objects.equals(trangThai, nhanVien.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ten, ma, tenDangNhap, matKhau, trangThai);
    }
}
