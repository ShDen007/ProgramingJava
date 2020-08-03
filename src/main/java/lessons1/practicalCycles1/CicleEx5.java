package lessons1.practicalCycles1;


import java.util.Scanner;

//Задание 5
//Пользователь вводит с клавиатуры длину линии.
//Нужно отобразить на экране горизонтальную линию из *,
//указанной длины.
//Например, если было введено 7, тогда вывод на экран
//будет такой:
//*******
public class CicleEx5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter line");
        String line = scan.nextLine();

        int res = line.length();
        for(int i = 0;i < res; i ++){
            System.out.print("*");
        }




scan.close();

    }
}
