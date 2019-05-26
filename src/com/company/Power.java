package com.company;
import java.util.Scanner; // импорт сканера

public class Power {

    static Scanner scan = new Scanner(System.in);

    public int getInt(){//валидатор ввода данных
        int num;
        if(scan.hasNextInt()){
            num = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();
            num = getInt();//рекурсия
        }
        return num;
    }

    static int getPower(int Num, int Pow){ // Num - число, Pow - степень
        int result = 1;//число в 0 степени = 1
        for (int i=1; i<=Pow; i++){//в цикле умножаем число Num количество Pow раз само на себя
            result = result*Num;
        }
        return result;//результат возведения в степень
    }


}
