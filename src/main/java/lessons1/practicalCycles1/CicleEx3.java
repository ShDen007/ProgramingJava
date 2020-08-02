package lessons1.practicalCycles1;

import java.util.Scanner;
//Задание 3
//Пользователь вводит с клавиатуры два числа. Нужно показать все нечетные числа в указанном диапазоне.
//Если границы диапазона указаны неправильно требуется
//произвести нормализацию границ. Например, пользователь ввел 20 и 11, требуется нормализация после которой
//начало диапазона станет равно 11, а конец 20.

public class CicleEx3 {
    public static void main(String[]args) {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan2.nextInt();
        System.out.println("First num - " + a);
        System.out.println("Enter second number");
        int b = scan2.nextInt();
        System.out.println("Second num - " + b);

        if (a <= b) {
            int n = b - a;
            for (int i = 0; i < n + 1; i++) {
                a++;
                if (a % 2 == 0)
                    System.out.println(a);
            }
        } else if (a > b) {
            int n = a - b;
            for (int i = 0; i < n + 1; i++) {
                b++;
                if (b % 2 == 0)
                    System.out.println(b);

            }


        }
    }
}






