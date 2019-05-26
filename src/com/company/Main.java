package com.company;
import java.util.Scanner; // импорт сканера

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задачи:");
        int i = 0;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            System.exit(0);
        }
        switch (i) {
            case 1: {
                //Задача 1 "Футбольный Матч"

                FootballMatch newFootballMatch = new FootballMatch();
                System.out.println("Введите результат команды 1:");
                int RealOutcome1 = newFootballMatch.getInt();//результат команды 1
                System.out.println("Введите результат команды 2:");
                int RealOutcome2 = newFootballMatch.getInt();//результат команды 2
                System.out.println("Введите прогноз для команды 1:");
                int Forecast1 = newFootballMatch.getInt();//прогноз для команды 1
                System.out.println("Введите прогноз для команды 2:");
                int Forecast2 = newFootballMatch.getInt();//прогноз для команды 2
                System.out.println("Матч завершен со счётом - " + RealOutcome1 + ":" + RealOutcome2
                        + ", пользовательский прогноз - " + Forecast1 + ":" + Forecast2);
                System.out.println("Результат матча: " + newFootballMatch.MatchForecast(RealOutcome1, RealOutcome2, Forecast1, Forecast2));
                System.exit(0);
            }

            case 2: {
                //Задача 2 "Ромб *"

                Rhombus newRhombus = new Rhombus();
                System.out.println("Введите размер ромба:");
                newRhombus.getOutput(newRhombus.getNumbAsterisk());
                System.exit(0);
            }

            case 3:{
                Power newPower = new Power();
                System.out.println("Введите число:");
                int Num = newPower.getInt();
                System.out.println("Введите значение степени:");
                int Pow = newPower.getInt();
                System.out.println(Num+" ^ "+Pow+" = "+newPower.getPower(Num,Pow));
                System.exit(0);
            }
            default: {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                System.exit(0);
            }
        }

    }
}
