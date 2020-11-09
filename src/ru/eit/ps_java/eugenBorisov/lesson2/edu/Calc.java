package calc;

public class Calc {
    int getSum(int a,int b){
        return a + b;
    }
    int getDif(int a,int b){
        return a - b;
    }
    int getMult(int a,int b){
        return a * b;
    }
    int getDiv(int a,int b){
        if(b == 0){
            return 0;
        }
        return a / b;
    }

    void mathOperation(int a,int b, char sign){
        switch (sign){
            case '+':
                System.out.println(getSum(a,b));
                break;

            case '-':
                System.out.println(getDif(a,b));
                break;
            case '*':
                System.out.println(getMult(a,b));
                break;
            case '/':
                System.out.println(getDiv(a,b));
                break;
            default:
                System.out.println("Вы ввели некорректный знак операции!");
        }
    }

    public static void main(String[] args) {
        new Calc().mathOperation(2,3,'*');
    }


}
