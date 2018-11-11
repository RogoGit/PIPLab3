package com;

import java.io.Serializable;

public class AreaClickedDots implements Serializable {
    private double aX;
    private double aY;
    private double aR;

    public AreaClickedDots() {

    }

    public double getaY() {
        return aY;
    }

    public void setaY(double aY) {
        this.aY = aY;
    }

    public double getaX() {
        return aX;
    }

    public void setaX(double aX) {
        this.aX = aX;
    }

    public double getaR() {
        return aR;
    }

    public void setaR(double aR) {
        this.aR = aR;
    }
}
