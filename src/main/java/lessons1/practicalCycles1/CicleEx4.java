package lessons1.practicalCycles1;

import java.util.Scanner;
//Задание 4
//Пользователь вводит с клавиатуры два числа. Нужно
//посчитать сумму чисел в указанном диапазоне, а также
//среднеарифметическое.
public class CicleEx4 {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("enter first num");
        int a = scanNum.nextInt();
        System.out.println("second - "+ a);
        System.out.println("enter second num");
        int b = scanNum.nextInt();
        System.out.println("second - "+ b);

        if (a <= b) {
            int n = b - a;
            for (int i = 0; i < n + 1; i++) {

               int g = a + 1;
               int c = a++;
               int sum = c + g ;
               System.out.println(c);
              System.out.println("Сума - "+sum);
                }

        }else
        if(a > b){
            int n = a - b;
            for (int i = 0; i < n +1; i++) {
                int c = b++;
                System.out.println(c);

            }


        }




    }
}
