package com.cursor.hw4.PlaneShape;

import com.cursor.hw4.Interfase.AreaMeasurable;
import com.cursor.hw4.Interfase.PerimeterMeasurable;
import com.cursor.hw4.Shape;
import com.cursor.hw4.Vertex.Vertex2D;


public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Vertex2D vertexA) {
        super(vertexA);
    }
}

