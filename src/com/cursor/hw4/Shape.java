package com.cursor.hw4;

import com.cursor.hw4.Vertex.Vertex;
import com.cursor.hw4.Vertex.Vertex3D;

public abstract class Shape {
    private Vertex vertexA;

    public Shape(Vertex vertexA) {
        this.vertexA = vertexA;
    }


    public void setVertexA(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public Vertex getVertexA() {
        return vertexA;
    }
}
