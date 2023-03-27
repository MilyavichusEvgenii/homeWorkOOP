package org.lesson_4;

import java.util.Scanner;

public class UI {
    static Scanner in = new Scanner(System.in);
    protected static void startProg(){
        System.out.println("При вводе дробных чисел, отделяем целую и дробную часть запятой!!!");
        System.out.println();
        double number1 = getNumber("Введите первое число: ");
        double number2 = getNumber("Введите второе число: ");
        String symbol = getSymbol("Введите один из математических операторов: +, -, *, /: ");
        calcMethod(number1, number2, symbol);
    }

    private static double getNumber(String massage){
        System.out.println(massage);
        double res = in.nextDouble();
        return res;
    }
    private static void calcMethod(double number1, double number2, String symbol){
        switch(symbol){
            case "+": Calculator<?, ?> adder = new Adder(number1, number2);
            adder.operate();
            break;
            case "-": Calculator<?, ?> subtract = new Subtract(number1, number2);
            subtract.operate();
            break;
            case "*": Calculator<?, ?> multiplication = new Multiplication(number1, number2);
            multiplication.operate();
            break;
            case "/": Calculator<?, ?> divider = new Divider(number1, number2);
            divider.operate();
            break;
            default:
                System.out.println("Вы ввели некорректный математический символ");
        }
    }
    private static String getSymbol(String massage){
        System.out.println(massage);
        String result = in.next();
        return result;
    }
}
