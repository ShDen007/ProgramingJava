package lessons1.practicalCycles1;

import java.util.Scanner;

//Задание 7
//Пользователь вводит с клавиатуры два числа (начало и
//конец диапазона). Требуется проанализировать все числа
//в этом диапазоне. Вывод на экран должен проходить по
//правилам, указанным ниже.
//Практические задания
//2
//Если число кратно 3 (делится на 3 без остатка) нужно
//вывести слово «Fizz». Если число кратно 5 нужно вывести
//слово «Buzz». Если число кратно 3 и 5 нужно вывести
//«Fizz Buzz». Если число не кратно не 3 и 5 нужно вывести
//само число
public class CicleEx7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int num = scan.nextInt();

        if(num % 3 != 0 & num % 5 != 0){
            System.out.println(num);}
        if(num%3 == 0 ){
            System.out.println("FIZZ");}
        if(num % 5 == 0) {
            System.out.println("BUZZ");
            }





    }
}
