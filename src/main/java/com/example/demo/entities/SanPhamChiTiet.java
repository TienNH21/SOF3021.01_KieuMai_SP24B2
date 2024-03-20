package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class SanPhamChiTiet {
    private int id;
    private int idMauSac;
    private int idKichThuoc;
    private int idSanPham;
    private String maSpct;
    private int soLuong;
    private double donGia;
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
    @Column(name = "IdMauSac", nullable = false)
    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    @Basic
    @Column(name = "IdKichThuoc", nullable = false)
    public int getIdKichThuoc() {
        return idKichThuoc;
    }

    public void setIdKichThuoc(int idKichThuoc) {
        this.idKichThuoc = idKichThuoc;
    }

    @Basic
    @Column(name = "IdSanPham", nullable = false)
    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    @Basic
    @Column(name = "MaSPCT", nullable = false, length = 255)
    public String getMaSpct() {
        return maSpct;
    }

    public void setMaSpct(String maSpct) {
        this.maSpct = maSpct;
    }

    @Basic
    @Column(name = "SoLuong", nullable = false)
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Basic
    @Column(name = "DonGia", nullable = false, precision = 0)
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
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
        SanPhamChiTiet that = (SanPhamChiTiet) o;
        return id == that.id && idMauSac == that.idMauSac && idKichThuoc == that.idKichThuoc && idSanPham == that.idSanPham && soLuong == that.soLuong && Double.compare(that.donGia, donGia) == 0 && trangThai == that.trangThai && Objects.equals(maSpct, that.maSpct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idMauSac, idKichThuoc, idSanPham, maSpct, soLuong, donGia, trangThai);
    }
}
