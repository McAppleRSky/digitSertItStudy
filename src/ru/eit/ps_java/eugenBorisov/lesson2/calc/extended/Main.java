package ru.eit.ps_java.eugenBorisov.lesson2.calc.extended;

import ru.eit.ps_java.eugenBorisov.lesson2.calc.extended.operations.AbstractOperation;

import java.util.Scanner;

public class Main {

    static final String[] greatMsg = {"Extended calc. Suply operation: +, -, *, /. With whitespace delimiter."
            , "Need input ... :"
    };

    public static void main(String[] args) {
        Calc calc;
        for (String msg : greatMsg) System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        while (true) {
            if (expression.isEmpty()) System.out.println(greatMsg[1]);
            else {
                /*
                *   Load operation by defined classes in defined package:
                *       Minus.java
                *       Plus.java
                *       Div.java
                *       Mult.java
                * */
                calc = new Calc(AbstractOperation.class);
                System.out.println( calc.parse(expression) );
                break;
            }
        }
        scanner.close();
    }

}
