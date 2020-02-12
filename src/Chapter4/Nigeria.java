package Chapter4;
/*
print the statements below:
Hello Nigeria
Hello Nigeria
Hello Nigeria how are you doing
Hello Nigeria
Hello Nigeria

create int counter variable
use while loop


*
*/
public class Nigeria{
    public static void main(String[] args){
        int counter = 0;
        while (counter <= 5){
            if(counter == 3){
                System.out.printf("%d Hello Nigeria, how are you doing? %n", counter);
            }
            else{
                System.out.printf("%d Hello Nigeria %n", counter);
            }
            counter ++;
        }
    }
}
