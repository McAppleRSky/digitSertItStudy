package ru.eit.ps_java.eugenBorisov.lesson6.src;

// Класс наследник круг
class Сircle extends Shape implements BuildMaterial {

    public void draw() {
        System.out.println("Круг");
    }

    @Override
    public void build() {
        System.out.println("Строим Круг");
    }

}
