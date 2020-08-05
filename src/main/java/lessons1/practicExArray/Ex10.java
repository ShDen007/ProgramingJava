package lessons1.practicExArray;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int [ ] mas = new int[3];
        int index = Arrays.binarySearch(mas,3);
        System.out.println(Arrays.toString(mas));
    }
}
