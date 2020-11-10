package ru.eit.ps_java.eugenBorisov.lesson6.dev.type.plaine;

import ru.eit.ps_java.eugenBorisov.lesson6.dev.shape.Circle;
import ru.eit.ps_java.eugenBorisov.lesson6.dev.shape.Square;
import ru.eit.ps_java.eugenBorisov.lesson6.dev.shape.Triangle;

public class Suply {

    private Circle circle;
    private Square square;
    private  Triangle triangle;

    public Suply(Circle circle, Square square, Triangle triangle) {
        this.circle = circle;
        this.square = square;
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public Square getSquare() {
        return square;
    }

    public Triangle getTriangle() {
        return triangle;
    }
}
