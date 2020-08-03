package lessons1.practicalCycles1;

import java.util.Scanner;

//Задание 6
//Пользователь вводит с клавиатуры длину линии и символ для заполнения линии. Нужно отобразить на экране
//вертикальную линию из введенного символа, указанной
//длины.
//Например, если было введено 5 и символ %, тогда
//вывод на экран будет такой:
//%
//%
//%
//%
//%
public class CicleEx6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter long line");
        String line  = scan.nextLine();

        System.out.println("enter symbol for");
        String symbol = scan.nextLine();


        int res = line.length();
        for(int i = 0; i < res; i ++){
            System.out.println(symbol);
        }




scan.close();

    }

}
