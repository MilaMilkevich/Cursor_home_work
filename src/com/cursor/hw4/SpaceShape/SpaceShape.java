package com.cursor.hw4.SpaceShape;

import com.cursor.hw4.Interfase.AreaMeasurable;
import com.cursor.hw4.Interfase.VolumeMeasurable;
import com.cursor.hw4.Shape;
import com.cursor.hw4.Vertex.Vertex3D;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D vertexA) {
        super(vertexA);

    }

}
