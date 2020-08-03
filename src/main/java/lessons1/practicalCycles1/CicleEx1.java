package lessons1.practicalCycles1;

import java.util.Scanner;
//Задание 1
//Пользователь вводит с клавиатуры два числа. Нужно
//показать все числа в указанном диапазоне.
public class CicleEx1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = scan1.nextInt();
        System.out.println("First num = " + a);
        System.out.println("Please enter second number");
        int b = scan1.nextInt();
        System.out.println("Second num = " + b);

        if (a <= b) {
            int n = b - a;
            for (int i = 0; i < n +1; i++) {
                int c = a++;
                System.out.println(c);}
            }else
                if(a > b){
                    int n = a - b;
                for (int i = 0; i < n +1; i++) {
                    int c = b++;
                    System.out.println(c);

            }

        }scan1.close();

    }
}