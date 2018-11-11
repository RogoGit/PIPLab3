package com;

import java.io.Serializable;

public class FormClickedDots implements Serializable {
    private double kx;
    private double ky;
    private double rad;


    public FormClickedDots() {

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
}
