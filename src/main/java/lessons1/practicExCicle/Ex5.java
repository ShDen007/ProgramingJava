package lessons1.practicExCicle;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static <integer> void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(5);

        for(Integer value : lists){
            System.out.println(value);
        }

    }
}
