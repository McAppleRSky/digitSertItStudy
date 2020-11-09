package oop;

public class Car {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    Car(String title, int price) {
        this.title = title;
        this.price = price;
//        this.drive();
    }
}


//    void setter(String title,int price){
//        this.title = title;
//        this.price = price;
//    }


//    void drive() {
//
//        System.out.println("Автомобиль " +title + " стоит " + price);
//    }
//}

//    public static void main(String[] args) {
//        Car car = new Car("Audi",1000);
////        car.setter("Audi",1000);
//
//        Car car2 = new Car("BMW",2000);
////        car2.setter("BMW",2000);
////        car.title = "Audi";
////        car.price = 1000;
////        car.drive();
////        car2.drive();
//    }
//}
