package lessons1.practicExCicle;

public class Ex7 {
    public static void main(String[] args) {
        two: for(int n = 0; n < 10;n ++){
        for(int j = 10; j> 0; j--){
            System.out.println(j - n + " ");
            if(j + n == 5 && n > 0)
                break two;
        }
        }
    }
}
