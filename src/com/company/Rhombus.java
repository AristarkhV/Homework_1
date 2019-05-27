package com.company;
import java.util.Scanner;

public class Rhombus {

    static Scanner scan = new Scanner(System.in);

    int getNumbAsterisk() {
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();
            num = getNumbAsterisk();
        }
        return num;
    }

    void getOutput(int NumbAsterisk) {

        for (int i = 0; i <= NumbAsterisk; i = i + 2) {//верх ромба,

            for (int putSpace = 0; putSpace < NumbAsterisk/2 - i/2 + NumbAsterisk%2; putSpace++)
                System.out.print(" ");

            for (int putAstr = 0; putAstr <= i - NumbAsterisk % 2 - 1; putAstr++)
                System.out.print("*");

            System.out.println("");

        }

        for (int i = 0; i <= NumbAsterisk; i = i + 2) {//низ ромба

            for (int putSpace = 0; putSpace < i / 2; putSpace++)
                System.out.print(" ");

            for (int putAstr = NumbAsterisk - i - 1; putAstr >= 0; putAstr--)
                System.out.print("*");

            System.out.println("");

        }


    }
}


