package ru.eit.ps_java.eugenBorisov.lesson1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /*
        *   Task 1
        * */
        int a = 1, b = 2, c = 3;
        String str = "Task 1: a = %d, b = %d, c = %d.";
        System.out.println( String.format(str, a, b, c) + "\n" );

        /*
         *   Task 2
         * */
        System.out.println( "Task 2: (a+b)/c = " + doTask2(a, b, c) + "\n" );

        /*
         *   Task 3
         * */
        System.out.println( "Task 3: " + doTask3("Java, сообщение!") + "\n" );

        /*
         *   Task 4
         * */
        System.out.println( "Task 4: " + doTask4(JOptionPane.showInputDialog("Введите год") ) );
    }

    static int doTask2(int a, int b, int c){
        return (a+b)/c;
    }

    static String doTask3(String msg){
        return msg;
    }

    static String doTask4(String yearInput){
        final int defaultDays = 28;
        int days = defaultDays,
                yearDigitCount = yearInput.length()<4 ? yearInput.length() : 4;
        Integer yearInt = null;
        try{
            yearInt = Integer.parseInt( yearInput.substring(0, yearDigitCount) );
        } catch (NumberFormatException numberFormatException) {
            return "Can't parse year";
        }
        if (yearInt < 4) return "unacceptably";
        else
            if (yearInt % 4 == 0)
                if ( yearInt % 100 != 0 || yearInt % 400 == 0) days = 29;
        if(yearInt == null) throw new NullPointerException("task4 crash");
        return "Days count on february " + yearInput + " is: " + days;
    }

}
