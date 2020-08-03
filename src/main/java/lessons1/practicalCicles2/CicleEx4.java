package lessons1.practicalCicles2;

import java.util.Scanner;

public class CicleEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scan.nextInt();
        System.out.println("enter second number");
        int b = scan.nextInt();


        if (a <= b) {
            int n = b - a;
            for (int i = 0; i < n + 1; i++) {
                a++;
                if (a % a == 0 & a % 1 == 0 & a % 2 != 0)
                    System.out.println(a);
            }

            }
scan.close();
        }

}