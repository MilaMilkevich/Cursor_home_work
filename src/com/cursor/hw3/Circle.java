package com.cursor.hw3;

public class Circle {

    private double radius;
    private double area;

    public void areaCircle() {
        area = Math.pow(radius, 2) * Math.PI;
    }

    public double getCircle() {
        return area;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}



