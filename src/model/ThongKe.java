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
public class ThongKe implements Serializable{
    private String ngay;
    private float tongTien;
    private String khuVuc;

    public ThongKe(String ngay, float tongTien, String khuVuc) {
        this.ngay = ngay;
        this.tongTien = tongTien;
        this.khuVuc = khuVuc;
    }

    public ThongKe() {
    }

    public String getNgay() {
        return ngay;
    }

    public float getTongTien() {
        return tongTien;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }
    
    
    
}
