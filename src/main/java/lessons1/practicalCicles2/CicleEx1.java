package lessons1.practicalCicles2;


import java.util.Scanner;

//Задание 1
//Пользователь вводит с клавиатуры размер стороны
//квадрата. Требуется отобразить на экран заполненный
//квадрат. Размер стороны равен введённому размеру. Например, если пользователь ввёл 3 на экране будет выведено:
//***
//***
//***
public class CicleEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input size square");
        int size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j ++){
            System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }



}




