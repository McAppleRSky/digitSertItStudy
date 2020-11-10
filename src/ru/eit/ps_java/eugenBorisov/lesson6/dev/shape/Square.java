package ru.eit.ps_java.eugenBorisov.lesson6.dev.shape;

// Класс наследник квадрат
public class Square extends Shape implements BuildMaterial {

    public void draw() {
        System.out.println("Квадрат");
    }

    @Override
    public void build() {
        System.out.println("Строим Квадрат");
    }

}
