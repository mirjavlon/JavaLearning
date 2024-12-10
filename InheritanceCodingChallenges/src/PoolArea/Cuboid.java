package PoolArea;

public class Cuboid extends Rectangle {

    private double heigth;

    public Cuboid(double length, double width, double heigth) {
        super(length,width);
        this.heigth = (heigth < 0) ? 0 : heigth;
    }

    public double getHeight() {
        return heigth;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}

