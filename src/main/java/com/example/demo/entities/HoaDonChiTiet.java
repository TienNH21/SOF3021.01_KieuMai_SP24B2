package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class HoaDonChiTiet {
    private int id;
    private int idHoaDon;
    private int idSpct;
    private int soLuong;
    private double donGia;
    private Timestamp thoiGian;
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
    @Column(name = "IdHoaDon", nullable = false)
    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    @Basic
    @Column(name = "IdSPCT", nullable = false)
    public int getIdSpct() {
        return idSpct;
    }

    public void setIdSpct(int idSpct) {
        this.idSpct = idSpct;
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
    @Column(name = "ThoiGian", nullable = false)
    public Timestamp getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Timestamp thoiGian) {
        this.thoiGian = thoiGian;
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
        HoaDonChiTiet that = (HoaDonChiTiet) o;
        return id == that.id && idHoaDon == that.idHoaDon && idSpct == that.idSpct && soLuong == that.soLuong && Double.compare(that.donGia, donGia) == 0 && trangThai == that.trangThai && Objects.equals(thoiGian, that.thoiGian);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idHoaDon, idSpct, soLuong, donGia, thoiGian, trangThai);
    }
}
