package ru.eit.ps_java.eugenBorisov.lesson6.dev.shape;

public class Circle extends Shape implements BuildMaterial {

    public void draw() {
        System.out.println("Круг");
    }

    @Override
    public void build() {
        System.out.println("Строим Круг");
    }

}
