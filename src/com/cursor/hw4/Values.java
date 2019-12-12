package com.cursor.hw4;

import com.cursor.hw4.PlaneShape.Circle;
import com.cursor.hw4.PlaneShape.Rectangle;
import com.cursor.hw4.PlaneShape.Triangle;
import com.cursor.hw4.SpaceShape.Cuboid;
import com.cursor.hw4.SpaceShape.SpaceShape;
import com.cursor.hw4.SpaceShape.Sphere;
import com.cursor.hw4.SpaceShape.SquarePyramid;
import com.cursor.hw4.Vertex.Vertex2D;
import com.cursor.hw4.Vertex.Vertex3D;

public class Values {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle(new Vertex2D(5, 7), new Vertex2D(14, 9), new Vertex2D(12, 7)),
                new Rectangle(new Vertex2D(300, 400), 50, 100),
                new Circle(new Vertex2D(14, 8), 7),
                new SquarePyramid(new Vertex3D(10, 10, 10), 15, 15),
                new Cuboid(new Vertex3D(20, 17, 14), 18, 18, 20),
                new Sphere(new Vertex3D(30, 30, 30), 60)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
