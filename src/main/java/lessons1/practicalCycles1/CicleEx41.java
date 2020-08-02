package lessons1.practicalCycles1;

import java.util.Scanner;

//Задание 4
//Пользователь вводит с клавиатуры число. Требуется
//посчитать факториал числа. Например, если введено 3,
//факториал числа 1*2*3 = 6.
//Практические задания
//1
//Формула для расчета факториала: n! = 1*2*3…*n, где
//n — число для расчета факториала.
public class CicleEx41 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int fact = scan.nextInt();
        System.out.println("Number - "+fact);
        int n = fact;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
            System.out.println(res);
        }


    }
}
