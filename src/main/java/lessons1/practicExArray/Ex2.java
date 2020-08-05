package lessons1.practicExArray;

import java.util.Arrays;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        int [] numbers = new int []{2,5,4,9,5};
        for(int number : numbers){
            number = 3;
            System.out.println(Arrays.toString(numbers));
        }
    }
}
