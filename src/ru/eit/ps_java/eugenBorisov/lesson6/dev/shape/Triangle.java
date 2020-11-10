package ru.eit.ps_java.eugenBorisov.lesson6.dev.shape;

// Класс наследник треугольник
public class Triangle extends Shape implements BuildMaterial {

    public void draw() {
        System.out.println("Треугольник");
    }

    @Override
    public void build() {
        System.out.println("Строим Треугольник");
    }
    
}
