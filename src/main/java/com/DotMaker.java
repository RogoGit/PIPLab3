package com;

import java.io.Serializable;

public class DotMaker implements Serializable {
    private double kx=0;
    private double ky=0;
    private double ax;
    private double ay;
    private double rad=1;
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

    public double getAx() {
        return ax;
    }

    public void setAx(double ax) {
        this.ax = ax;
    }

    public double getAy() {
        return ay;
    }

    public void setAy(double ay) {
        this.ay = ay;
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

        return (this.kx <= 0 && this.ky <= 0 && Math.abs(this.kx) <= this.rad / 2 && Math.abs(this.ky) <= this.rad) ||
                (this.kx <= 0 && this.ky >= 0 && (this.kx * this.kx + this.ky * this.ky) <= (this.rad * this.rad)) ||
                (this.kx >= 0 && this.ky <= 0 && this.ky >= (2 * this.kx - this.rad / 2));
    }

    public String calcColor() {
        if (areaCheck()) {
            return "green";
        } else {
            return "red";
        }
    }

    public String calcRes() {
        if (areaCheck()) {
            return "Попадает";
        } else {
            return "Не попадает";
        }
    }

    }


