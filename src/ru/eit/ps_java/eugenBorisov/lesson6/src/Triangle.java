package ru.eit.ps_java.eugenBorisov.lesson6.src;

// Класс наследник треугольник
class Triangle extends Shape implements BuildMaterial {

    public void draw() {
        System.out.println("Треугольник");
    }

    @Override
    public void build() {
        System.out.println("Строим Треугольник");
    }

}
