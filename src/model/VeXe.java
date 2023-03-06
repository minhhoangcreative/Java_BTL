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
public class VeXe implements Serializable{
    private String maVe;
    private String tenVe;
    private float giaTien;
    
    public VeXe() {
        maVe = tenVe = "";
        giaTien =0f;
    }

    public VeXe(String maVe, String tenVe, float giaTien) {
        this.maVe = maVe;
        this.tenVe = tenVe;
        this.giaTien = giaTien;
    } 
    public String getMaVe() {
        return maVe;
    }

    public String getTenVe() {
        return tenVe;
    }

    public float getGiaTien() {
        return giaTien;
    }



    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public void setTenVe(String tenVe) {
        this.tenVe = tenVe;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }
    @Override
    public String toString() {
        return "VeXe{" + "maVe=" + maVe + ", tenVe=" + tenVe + ", giaTien=" + giaTien + '}';
    }
    
}
