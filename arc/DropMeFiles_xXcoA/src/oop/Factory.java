package oop;

public class Factory {
    Car createCar(String title){
//        Car c = new Car(title,price);
        return new Car(title, (int) (Math.random()* 4000 + 1000));
    }

}
