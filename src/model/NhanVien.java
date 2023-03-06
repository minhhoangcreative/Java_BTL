/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class NhanVien extends TrucBan implements Serializable{
    private String maNV;
    private String tenNV;

    public NhanVien(String maNV, String tenNV, String caTruc, String khu, String ngayTruc) {
        super(caTruc, khu, ngayTruc);
        this.maNV = maNV;
        this.tenNV = tenNV;
    }

    public NhanVien(String tenNV, String caTruc, String khu, String ngayTruc) {
        super(caTruc, khu, ngayTruc);
        this.tenNV = tenNV;
    }
    
    public NhanVien() {
        maNV = tenNV = "";
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }
    
    
}
