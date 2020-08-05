package lessons1.practicExArray;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int [] mas = new int[10];
        int startInsex = 1;
        int endIndex = 4;
        Arrays.fill(mas,startInsex,endIndex,2);
        System.out.println(Arrays.toString(mas));
    }
}
