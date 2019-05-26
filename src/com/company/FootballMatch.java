package com.company;
import java.util.Scanner; // импорт сканера


public class FootballMatch {

    static Scanner scan = new Scanner(System.in);
    public int MatchOutcome; // переменная исхода матча

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

    //метод подсчёта исхода матча RealOutcome 1 и 2 - реальный счёт, Forecast 1 и 2 - прогноз пользователя
    public int MatchForecast(int RealOutcome1,int RealOutcome2,int Forecast1, int Forecast2){
        if((RealOutcome1 == Forecast1 && RealOutcome2 == Forecast2))//пользователь угадал, исход = 2
        {
            MatchOutcome = 2;
        }
        else {
            //проверка выиграла ли команда пользователя
            if ((RealOutcome1 >= RealOutcome2 && Forecast1 >= Forecast2) ||
                    ((RealOutcome1 <= RealOutcome2 && Forecast1 <= Forecast2)))
                MatchOutcome = 1;//команда пользователя не выиграла, исход = 1
            else//команда пользователя не выиграла, исход = 0
                MatchOutcome = 0;
        }
        return MatchOutcome;//возвращаем исход

    }
}
