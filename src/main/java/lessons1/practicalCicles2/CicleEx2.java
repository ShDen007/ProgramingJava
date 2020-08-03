package lessons1.practicalCicles2;


import java.util.Scanner;

//Задание 2
//Пользователь вводит с клавиатуры размер стороны
//квадрата. Требуется отобразить на экран незаполненный
//квадрат (отображаются только границы квадрата). Размер
//стороны равен введённому размеру.
public class CicleEx2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size)
                    System.out.print("* ");
                else if (j == 1 || j == size)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        scan.close();

    }


}
