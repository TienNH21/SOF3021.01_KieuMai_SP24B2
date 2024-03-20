package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;
import java.util.Objects;

@Entity
public class HoaDon {
    private int id;
    private int idKh;
    private int idNv;
    private Date ngayMuaHang;
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
    @Column(name = "IdKH", nullable = false)
    public int getIdKh() {
        return idKh;
    }

    public void setIdKh(int idKh) {
        this.idKh = idKh;
    }

    @Basic
    @Column(name = "IdNV", nullable = false)
    public int getIdNv() {
        return idNv;
    }

    public void setIdNv(int idNv) {
        this.idNv = idNv;
    }

    @Basic
    @Column(name = "NgayMuaHang", nullable = false)
    public Date getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(Date ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
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
        HoaDon hoaDon = (HoaDon) o;
        return id == hoaDon.id && idKh == hoaDon.idKh && idNv == hoaDon.idNv && trangThai == hoaDon.trangThai && Objects.equals(ngayMuaHang, hoaDon.ngayMuaHang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idKh, idNv, ngayMuaHang, trangThai);
    }
}
