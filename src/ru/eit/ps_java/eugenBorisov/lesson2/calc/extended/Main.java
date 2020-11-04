package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations.AbstractOperation;

import java.util.Scanner;

public class Main {

    static final String[] greatMsg = {"Extended calc. Suply operation: +, -, *, /. With whitespace delimiter."
            , "Need input ... :"
    };

    public static void main(String[] args) {
        for (String msg : greatMsg) System.out.println(msg);
        Calc calc = new Calc(AbstractOperation.class);
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        while (true) {
            if (expression.isEmpty()) System.out.println(greatMsg[1]);
            else {
                System.out.println(calc.solve(expression));
                break;
            }
        }
        scanner.close();
    }

}
