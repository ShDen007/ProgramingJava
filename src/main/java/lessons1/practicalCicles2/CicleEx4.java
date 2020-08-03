package lessons1.practicalCicles2;

import java.util.Scanner;

public class CicleEx4 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan1.nextInt();
        System.out.println("First num - " + a);
        System.out.println("Enter second number");
        int b = scan1.nextInt();
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
                --a;
                if (a % 2 == 0)
                    System.out.println(a);

            }


        }scan1.close();
    }


}
