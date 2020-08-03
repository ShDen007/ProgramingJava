package lessons1.practicalCicles2;

import java.util.Scanner;

//Задание 3
//Пользователь вводит с клавиатуры длину и ширину
//прямоугольника. Требуется отобразить на экран незаполненный прямоугольник (отображаются только границы прямоугольника). Размер длины и ширины равен
//введенным данным.
public class CicleEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input length rectangle");
        int length = scan.nextInt();
        System.out.println("input weight rectangle");
        int weight = scan.nextInt();

        for(int i = 1; i <= length; i++) {
            for (int j = 1; j <= weight; j++) {
                if (i == 1 || i == length)
                    System.out.print("* ");
                else if (j == 1 || j == weight)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }



scan.close();
    }

}
