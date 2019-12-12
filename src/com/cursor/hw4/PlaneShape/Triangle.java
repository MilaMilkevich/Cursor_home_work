package com.cursor.hw4.PlaneShape;

import com.cursor.hw4.PlaneShape.PlaneShape;
import com.cursor.hw4.Vertex.Vertex;
import com.cursor.hw4.Vertex.Vertex2D;

public class Triangle extends PlaneShape {

    private Vertex2D vertexB;
    private Vertex2D vertexC;

    private double sideAB;
    private double sideBC;
    private double sideCA;

    public Triangle(Vertex2D vertesA, Vertex2D vertexB, Vertex2D vertexC) {
        super(vertesA);
        this.vertexB = vertexB;
        this.vertexC = vertexC;
        findSideTriangle();
    }

    public void setVertexB(Vertex2D vertexB) {
        this.vertexB = vertexB;
    }

    public Vertex2D getVertexB() {
        return vertexB;
    }

    public void setVertexC(Vertex2D vertexC) {
        this.vertexC = vertexC;
    }

    public Vertex2D getVertexC() {
        return vertexC;
    }

    public double findLengthSides(Vertex vertex1, Vertex vertex2) {
        return Math.sqrt(Math.pow((vertex1.getX() - vertex2.getX()), 2)
                + Math.pow((vertex1.getY() - vertex2.getY()), 2));
    }

    private void findSideTriangle() {
        sideAB = findLengthSides(this.getVertexA(), this.getVertexB());
        sideBC = findLengthSides(this.vertexB, this.vertexC);
        sideCA = findLengthSides(this.vertexC, this.getVertexA());
    }

    @Override
    public double calculateArea() {
        double p = this.calculatePerimeter() / 2;
        return Math.sqrt(p * ((p - sideAB) * (p - sideBC) * (p - sideCA)));
    }

    @Override
    public double calculatePerimeter() {
        return this.sideAB + this.sideBC + this.sideCA;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "Vertex a: ( " + getVertexA() +
                "), Vertex b: ( " + getVertexB() +
                "), Vertex c: ( " + getVertexC() +
                "), area = " + calculateArea() +
                ", perimeter = " + calculateArea() +
                '.';
    }

}
