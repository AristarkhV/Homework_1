package com.company;
import java.util.Scanner; // импорт сканера

public class Rhombus {

    static Scanner scan = new Scanner(System.in);

    int getNumbAsterisk() {//валидатор ввода данных
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();
            num = getNumbAsterisk();//рекурсия
        }
        return num;
    }

    void getOutput(int NumbAsterisk) {

        for (int i = 0; i <= NumbAsterisk; i = i + 2) {//верх ромба, i - номер строки

            for (int putSpace = 0; putSpace < NumbAsterisk/2 - i/2 + NumbAsterisk%2; putSpace++)
                System.out.print(" ");

            for (int putAstr = 0; putAstr <= i - NumbAsterisk % 2 - 1; putAstr++)
                System.out.print("*");

            System.out.println("");

        }

        for (int i = 0; i <= NumbAsterisk; i = i + 2) {//низ ромба, i - номер строки

            for (int putSpace = 0; putSpace < i / 2; putSpace++)
                System.out.print(" ");

            for (int putAstr = NumbAsterisk - i - 1; putAstr >= 0; putAstr--)
                System.out.print("*");

            System.out.println("");

        }


    }
}


