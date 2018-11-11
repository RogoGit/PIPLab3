package com;

import java.io.Serializable;

public class DotMaker implements Serializable {
    private double kx;
    private double ky;
   // private double ax;
 //   private double ay;
    private double rad;
    private String color;
    private String res;

    public DotMaker(double kx, double ky, double rad, String color, String res) {
        this.kx = kx;
        this.ky = ky;
        this.rad = rad;
        this.color = color;
        this.res = res;
    }

    public DotMaker() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKx() {
        return kx;
    }

    public void setKx(double kx) {
        this.kx = kx;
    }

    public double getKy() {
        return ky;
    }

    public void setKy(double ky) {
        this.ky = ky;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public boolean areaCheck() {

        return (this.kx <= 0 && this.ky <= 0 && -this.kx <= this.rad / 2 && -this.ky <= this.rad) ||
                (this.kx <= 0 && this.ky >= 0 && (this.kx * this.kx + this.ky * this.ky) <= (this.rad * this.rad) / 4) ||
                (this.kx >= 0 && this.ky <= 0 && this.ky >= (-this.kx - this.rad)); // FIX IT!!!
    }

    public void calcColor() {
        if (areaCheck()) {
            this.color = "green";
        } else {
            this.color="red";
        }
    }

    public void calcRes() {
        if (areaCheck()) {
            this.color = "Попадает";
        } else {
            this.color="Не попадает";
        }
    }

    }


