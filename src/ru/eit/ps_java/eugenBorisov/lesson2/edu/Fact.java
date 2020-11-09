package calc;

public class Fact {
//    5! = 1 * 2 * 3 * 4 * 5 = 5 * 4!
//    n! = n * (n-1)!

    int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
//3! = 3 * fact(2) = 3 * 2 * 1


    public static void main(String[] args) {
        System.out.println(new Fact().fact(5));
    }
}