import java.util.Scanner;

public class Converter {
    String val1, val2;
    double money, result;

    double de = 1.2, euro = 95, baks = 80;

    Converter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваша исходная валюта");
        val1 = sc.next();
        System.out.println("Ваша тербуемая валюта");
        val2 = sc.next();
        System.out.println("Ваша сумма");
        money = sc.nextDouble();
        sc.close();
        convert();
    }

    private void convert() {
        if(!val1.equals(val2)){
            switch (val1){
                case "rub":
                    if(val2.equals("euro")){
                        result = money / euro;
                    }
                    else{
                        result = money / baks;
                    }
                    break;

                case "euro":
                    if(val2.equals("rub")){
                        result = money * euro;
                    }
                    else{
                        result = money / de;
                    }
                    break;

                case "baks":
                    if(val2.equals("rub")){
                        result = money * baks;
                    }
                    else{
                        result = money * de;
                    }
                    break;
            }
            System.out.println(money + "   " + val1 + " -> " + val2 + " "+result);

        }
        else{
            System.out.println("Некорректно указаны валюты");
        }
    }

    public static void main(String[] args) {
        new Converter();
    }
}
