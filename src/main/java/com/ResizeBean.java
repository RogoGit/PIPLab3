package com;

import java.io.Serializable;

public class ResizeBean implements Serializable {
    private double newR;
    private double oldR;

    public ResizeBean() {

    }

    public double getNewR() {
        return newR;
    }

    public void setNewR(double newR) {
        this.newR = newR;
    }

    public double getOldR() {
        return oldR;
    }

    public void setOldR(double oldR) {
        this.oldR = oldR;
    }
}
