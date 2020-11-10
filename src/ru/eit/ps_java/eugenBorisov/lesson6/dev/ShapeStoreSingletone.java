package ru.eit.ps_java.eugenBorisov.lesson6.dev;

import ru.eit.ps_java.eugenBorisov.lesson6.dev.shape.Circle;
import ru.eit.ps_java.eugenBorisov.lesson6.dev.shape.Triangle;
import ru.eit.ps_java.eugenBorisov.lesson6.dev.shape.Square;
import ru.eit.ps_java.eugenBorisov.lesson6.dev.type.plaine.Suply;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ShapeStoreSingletone {

    private static ShapeStoreSingletone instance = new ShapeStoreSingletone();

    Set<Circle> circles = Stream.generate( ()->new Circle() )
            .limit( (int)(Math.random()*9) )
            .collect( Collectors.toSet() );
    Set<Square> squares = Stream.generate( ()->new Square() )
            .limit( (int)(Math.random()*9) )
            .collect( Collectors.toSet() );
    Set<Triangle> triangles = Stream.generate( ()->new Triangle() )
            .limit( (int)(Math.random()*9) )
            .collect( Collectors.toSet() );

    public Suply suply() {
        Suply result = null;
        Circle circle = null;
        Square square = null;
        Triangle triangle = null;
        try{
            circle  = (Circle) circles.toArray()[0];
            circle.draw();
        }catch (Exception exception){}
        try{
            square  = (Square) squares.toArray()[0];
            square.draw();
        }catch (Exception exception){}
        try{
            triangle  = (Triangle) triangles.toArray()[0];
            triangle.draw();
        }catch (Exception exception){}
        if (circle==null || square==null || triangle==null)
            throw new NullPointerException("Дом не строиться");
        else {
            result = new Suply(circle, square, triangle);
            circles.remove(circle);
            squares.remove(square);
            triangles.remove(triangle);
        }
        return result;
    }

    public static ShapeStoreSingletone getInstance() {
        ShapeStoreSingletone localInstance = instance;
        if (localInstance == null) {
            synchronized (ShapeStoreSingletone.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ShapeStoreSingletone();
                }
            }
        }
        return localInstance;
    }

}
