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
public class KhuVuc implements Serializable{
    private String khuVuc;
    private int soLuong = 20;
    float tongTien = 0;
    public KhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }
    
    public KhuVuc() {
        khuVuc = "Khu A";
    }
    
    public float TongTien(VeXe x){
        tongTien += x.getGiaTien();
        return tongTien;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    
    public void setTongTien(VeXe x) {
        this.tongTien = this.tongTien + x.getGiaTien();
    }

    
    
}
