package oop;

public class Main {
    static void printInfo(Car cars[]){
        for(var car : cars){
            System.out.println("Автомобиль "+car.getTitle() + " стоит "+car.getPrice());
        }
    }


    public static void main(String[] args) {
        int count = (int) (Math.random() * 25 + 5);
        Car cars[] = new Car[count];
        String vag[] = {"Audi","Skoda","VW"};
        var factory = new Factory();
        int s = 0;
        for(var i=0;i<count;i++){
            cars[i] = factory.createCar(vag[(int) (Math.random() * vag.length)]);
            s += cars[i].getPrice();
        }
        printInfo(cars);
        System.out.println("Общая стоимость всех авто составляет "+s);

    }
}
