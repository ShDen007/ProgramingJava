package lessons1.practicExArray;

import java.util.Arrays;
import java.util.Collections;

public class Ex8 {
    public static void main (String[] args){

        Integer [] mas = new Integer[]{ 2,5,8,7,5,9};
        Arrays.sort(mas, Collections.reverseOrder());
        System.out.println(Arrays.toString(mas));
    }
}
