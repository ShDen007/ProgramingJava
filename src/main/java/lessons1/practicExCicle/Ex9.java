package lessons1.practicExCicle;

public class Ex9 {
    public static void main(String[] args) {

        one :for(int i = 0; i < 10; i++){
        for(int j = 0; j < 10; j++){
            if(i == j)continue one;
            System.out.printf("i = %d j = %d\n", i , j);
        }
        }
    }
}
