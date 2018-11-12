package com;

import java.io.Serializable;
import java.util.ArrayList;

public class DotsCollectionBean implements Serializable {

    private ArrayList<DotMaker> areaDots;
    private boolean changeR = false;

    public DotsCollectionBean(ArrayList<DotMaker> areaDots) {
        this.areaDots = areaDots;
    }

    public DotsCollectionBean() {

    }

    public boolean getChangeR() {
        return changeR;
    }

    public void setChangeR(boolean changeR) {
        this.changeR = changeR;
    }

    public void addDot(String kx, String ky, String rad) {
        if (this.changeR) {
            this.changeR = false;
            reSizeDots(Double.parseDouble(rad));
            return;
        }

        if (this.areaDots==null) {this.areaDots=new ArrayList<>();}
        DotMaker newDot = new DotMaker();
        newDot.setKx(Double.parseDouble(kx));
        newDot.setKy(Double.parseDouble(ky));
        newDot.setRad(Double.parseDouble(rad));
        newDot.setColor(newDot.calcColor());
        newDot.setRes(newDot.calcRes());
        newDot.setAx(Double.parseDouble(kx));
        newDot.setAy(Double.parseDouble(ky));
        areaDots.add(newDot);
    }

    public ArrayList<DotMaker> getAreaDots() {
        return areaDots;
    }

    public void clearDots() {
        this.areaDots = new ArrayList<>();
    }

    public void reSizeDots(double newR) {
if (this.areaDots != null) {
    for (DotMaker dot : this.areaDots) {
        dot.setAx(((dot.getKx() - 190) * (newR) / dot.getRad() + 190)*0.01);
        dot.setAy(((dot.getKy() - 210) * (newR) / dot.getRad() + 210)*0.01);
        dot.setColor(dot.calcColor());
    }
}
    }

}