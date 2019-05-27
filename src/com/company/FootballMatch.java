package com.company;
import java.util.Scanner; 


public class FootballMatch {

    static Scanner scan = new Scanner(System.in);
    public int MatchOutcome; 

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

   
    public int MatchForecast(int RealOutcome1,int RealOutcome2,int Forecast1, int Forecast2){
        if((RealOutcome1 == Forecast1 && RealOutcome2 == Forecast2))
        {
            MatchOutcome = 2;
        }
        else {
      
            if ((RealOutcome1 >= RealOutcome2 && Forecast1 >= Forecast2) ||
                    ((RealOutcome1 <= RealOutcome2 && Forecast1 <= Forecast2)))
                MatchOutcome = 1;
            else/
                MatchOutcome = 0;
        }
        return MatchOutcome;

    }
}
