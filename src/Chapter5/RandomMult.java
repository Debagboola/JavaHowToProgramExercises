package Chapter5;
import java.security.SecureRandom;
public class RandomMult {
    public static void main(String[] args){
        SecureRandom random = new SecureRandom();

        for(int counter = 1; counter <= 20;counter++ ){
            int value = random.nextInt( 100);
            if(value % 3 == 0){
                System.out.printf("%d is a multiple of 3 %n", value);
            }
            else{
                System.out.printf("%d is not a multiple of 3 %n", value);
            }
        }

    }
}
