package ru.eit.ps_java.eugenBorisov.lesson2.calc.simple;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calc {

    private static final Logger logger;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-7s] %5$s %n");
        logger = Logger.getLogger(Calc.class.getName());
        logger.setLevel(Level.WARNING);
    }

    static int solvePlus(int a, int b) {
        return a + b;
    }

    static int solveMinus(int a, int b) {
        return a - b;
    }

    static int solveMult(int a, int b) {
        return a * b;
    }

    static float solveDiv(int a, int b) {
        return a / b;
    }

    static final String[] greatMsg = {"Simple calc. Suply operation: +, -, *, /. With whitespace delimiter."
            , "Need input ... :"
    };

    static String solveByWhitespaceDelimiter(String expression) {
        String result = null;
        String[] elements = expression.split(" ");
        int[] arg = new int[2];
        if(elements.length>3)logger.warning("More then two arguments (+ operation)");
        else{
            if(elements.length<3)throw new NullPointerException("Too few arguments");
            try {
                arg[0] = Integer.parseInt(elements[0]);
                arg[1] = Integer.parseInt(elements[2]);
            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
            }
            switch ( elements[1].charAt(0) ){
                case '+':
                    result = Integer.toString( solvePlus(arg[0], arg[1]) );
                    break;
                case '-':
                    result = Integer.toString( solveMinus(arg[0], arg[1]) );
                    break;
                case '*':
                    result = Integer.toString( solveMult(arg[0], arg[1]) );
                    break;
                case '/':
                    result = arg[1] == 0 ? "Error: divide by zero"
                            : Float.toString( solveDiv(arg[0], arg[1]) );
                    break;
                default:
                    throw new NullPointerException("Unknown operation");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (String msg : greatMsg) System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        while (true) {
            if (expression.isEmpty()) System.out.println(greatMsg[1]);
            else {
                System.out.println(solveByWhitespaceDelimiter(expression));
                break;
            }
        }
        scanner.close();
    }

}
