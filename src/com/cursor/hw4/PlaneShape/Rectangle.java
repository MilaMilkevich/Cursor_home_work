package com.cursor.hw4.PlaneShape;

import com.cursor.hw4.PlaneShape.PlaneShape;
import com.cursor.hw4.Vertex.Vertex2D;

public class Rectangle extends PlaneShape {

    double width;
    double high;

    public Rectangle(Vertex2D vertexA, double width, double high) {
        super(vertexA);
        this.width = width;
        this.high = high;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    @Override
    public double calculateArea() {
        return this.width * this.high;
    }

    @Override
    public double calculatePerimeter() {
        return (this.width + this.high) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "Vertex (" + getVertexA() +
                "), width = " + width +
                ", high = " + high +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter() +
                '.';
    }
}
