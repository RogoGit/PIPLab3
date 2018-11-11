package com;

import java.io.Serializable;
import java.util.ArrayList;

public class DotsCollectionBean implements Serializable {

    private ArrayList<DotMaker> areaDots;

    public DotsCollectionBean(ArrayList<DotMaker> areaDots) {
        this.areaDots = areaDots;
    }

    public DotsCollectionBean() {

    }

    public void addDot(String kx, String ky, String rad) {
        if (this.areaDots==null) {this.areaDots=new ArrayList<>();}
        DotMaker newDot = new DotMaker();
        newDot.setKx(Double.parseDouble(kx));
        newDot.setKy(Double.parseDouble(ky));
        newDot.setRad(Double.parseDouble(rad));
        newDot.calcColor();
        newDot.calcRes();
        areaDots.add(newDot);
    }

    public ArrayList<DotMaker> getAreaDots() {
        return areaDots;
    }

    public void clearDots() {
        this.areaDots = new ArrayList<>();
    }

    public void reSizeDots(double newR, double oldR) {
if (this.areaDots != null) {
    for (DotMaker dot : this.areaDots) {
        dot.setKx((dot.getKx() - 190) * oldR / dot.getRad() + 190);
        dot.setKy((dot.getKy() - 210) * oldR / dot.getRad() + 210);
        dot.calcColor();
    }
}
    }

}