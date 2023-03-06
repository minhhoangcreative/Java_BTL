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
public class TrucBan implements Serializable{
    private String caTruc;
    private String khu;
    private String ngayTruc;

    public TrucBan(String caTruc, String khu, String ngayTruc) {
        this.caTruc = caTruc;
        this.khu = khu;
        this.ngayTruc = ngayTruc;
    }

    public TrucBan() {
        caTruc = ngayTruc = khu = "";
    }

    public String getCaTruc() {
        return caTruc;
    }

    public String getKhu() {
        return khu;
    }

    public String getNgayTruc() {
        return ngayTruc;
    }

    public void setCaTruc(String caTruc) {
        this.caTruc = caTruc;
    }

    public void setKhu(String khu) {
        this.khu = khu;
    }

    public void setNgayTruc(String ngayTruc) {
        this.ngayTruc = ngayTruc;
    }
    
    
            
}
