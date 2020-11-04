package ru.eit.ps_java.eugenBorisov.lesson2.edu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ввведите name ");
            String name = scanner.nextLine();
            if ( !name.isEmpty() ){
                System.out.println("Добрый день, " + name);
                scanner.close();
                break;
            }else System.out.println("Вы не указали Ваше имя. Повторите ввод");
        }
*/

/*
        int x = (int) Math.random() * 9 + 1, y = (int) Math.random() * 9 + 1, res = x + y;
        System.out.println("Вычислите " + x + " * " + y + " = ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int answer = scanner.nextInt();
            if (answer == res) System.out.println("Вурно");
            else System.out.println("Не верно. Верный ответ " + res);
        } else System.out.println("Не кооректное значение");
        scanner.close();
*/

/*
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
*/

/*
        var i = 1;
        while(i<=10) System.out.println("Значение i = " + i++);
*/

/*
        var i = 1;
        while(i <=10) System.out.print(i++ + "\t");
        System.out.println();
        i = 1;
        while(i <=10) System.out.print(i*i++ + "\t");
*/

/*
        int i=1, j;
        while(i <=100){
            j=1;
            while(j <=100)
                System.out.print(i * j++ +"\t");
            System.out.println();
            i++;
        }
*/
        // break - выход из цикла
        // continue - переход к следуешему цшагу итерации (goto end) (!) нужно не пропустить инкремент иначе бесконечный цикл
    }
}
