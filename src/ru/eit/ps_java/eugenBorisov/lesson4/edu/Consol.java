package ru.eit.ps_java.eugenBorisov.lesson4.edu;

import static java.lang.String.format;

public class Consol {
    public static void SetCursorPosNix(int xPos, int yPos) {
        System.out.println(format("\033[%d;%dH", yPos+1, xPos+1));
    }

    public static void setCursorPorisionNix(int x, int y) {
        final char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df", escCode, y, x));
    }

    public static void main(String[] args) {
        System.out.print("Hello world !");
        //setCursorPorisionNix(5, 5);
        setCursorPorisionNix(4,4);
        System.out.print("X");
    }

}
