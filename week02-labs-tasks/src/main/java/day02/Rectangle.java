package day02;

public class Rectangle {

    private double aRectangle;
    private double bRectangle;

    public Rectangle(double aRectangle, double bRectangle) {
        this.aRectangle = aRectangle;
        this.bRectangle = bRectangle;
    }

    public double calculateArea() {
        return aRectangle*bRectangle;
    }

}