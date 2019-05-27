package com.company;
import java.util.Scanner; 

public class Power {

    static Scanner scan = new Scanner(System.in);

    public int getInt(){
        int num;
        if(scan.hasNextInt()){
            num = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();
            num = getInt();
        }
        return num;
    }

    static int getPower(int Num, int Pow){ 
        int result = 1;
        for (int i=1; i<=Pow; i++){
            result = result*Num;
        }
        return result;
    }


}
