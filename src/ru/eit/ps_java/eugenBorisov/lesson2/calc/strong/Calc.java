package ru.eit.ps_java.eugenBorisov.lesson2.calc.strong;

import java.util.ArrayList;
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

    public static int solvePlus(int a, int b) {
        return a + b;
    }

    public static int solveMinus(int a, int b) {
        return a - b;
    }

    public static int solveMult(int a, int b) {
        return a * b;
    }

    public static float solveDiv(int a, int b) {
        return a / b;
    }

    static final String[] greatMsg = {"Simple calc. Suply operation: +, -, *, /."
            , "Need input ... :"
    };

    static final String operationQuatro;

    static {
        operationQuatro = "[+-]|\\*|\\/"
        ;
    }

    public static String solve(String expression) {
        String result = null;
        ArrayList<Integer> argsIntList = new ArrayList<>();
        String[] operands = expression.split(operationQuatro);
        if (operands.length > 2) logger.warning("More then two arguments");
        if (operands.length < 2) throw new NullPointerException("Too few arguments");
        else {
            for (String arg : operands)
                try {
                    argsIntList.add(Integer.parseInt(arg));
                } catch (NumberFormatException numberFormatException) {
                    numberFormatException.printStackTrace();
                }
            switch (expression.charAt(operands[0].length())) {
                case '+':
                    result = Integer.toString(solvePlus(argsIntList.get(0), argsIntList.get(1)));
                    break;
                case '-':
                    result = Integer.toString(solveMinus(argsIntList.get(0), argsIntList.get(1)));
                    break;
                case '*':
                    result = Integer.toString(solveMult(argsIntList.get(0), argsIntList.get(1)));
                    break;
                case '/':
                    result = argsIntList.get(1) == 0
                            ? "Error: divide by zero"
                            : Float.toString(
                            solveDiv(
                                    argsIntList.get(0), argsIntList.get(1)
                            )
                    );
                    break;
                default:
                    throw new NullPointerException("Unknown operation");
            }
        }
        if (result == null) throw new NullPointerException("Can't return result");
        return result;
    }

    public static void main(String[] args) {
        for (String msg : greatMsg) System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        while (true) {
            if (expression.isEmpty()) System.out.println(greatMsg[1]);
            else {
                System.out.println(solve(expression));
                break;
            }
        }
        scanner.close();
    }

}
