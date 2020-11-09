package polimorf;

public class CalcArea {

    CalcArea(){
        System.out.println("Вызов конструктора по умолчанию");
    }
    CalcArea(String test){
        System.out.println(test);

    }



    int s(int a,int b){
        return a * b;
    }

    double s(int r){
        return Math.PI * Math.pow(r,2);
    }

    public static void main(String[] args) {
        var obj = new CalcArea("Был вызван конструктор с параметрами");
        System.out.println("Площадь круга = "+ obj.s(5));
        System.out.println("Площадь прямоугольника = "+ obj.s(2,25));
    }

}
