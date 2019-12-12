package com.cursor.hw4.PlaneShape;

import com.cursor.hw4.Vertex.Vertex2D;

public class Circle extends PlaneShape {


    private double radius;

    public Circle(Vertex2D vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "Vertex (" + getVertexA() +
                "), radius = " + getRadius() +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter() +
                '.';
    }
}

