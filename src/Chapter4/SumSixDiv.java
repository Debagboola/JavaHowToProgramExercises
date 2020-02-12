package Chapter4;
/*
* calculate the sum of the first seven numbers, that at immediately each number is added:
 system checks if the sum is divisible by 6.
 if the sum is divisible by 6, system removes added number and adds next number.
 this process continues til the seventh number is added
 * once  the seventh number has been added, end loop.
* */

public class SumSixDiv {
    public static void main(String[] arg){
        int value = 0;
        int sum = 0;
        while (value <= 7){
            sum = sum + value;

            if(sum % 6 == 0){
                sum = sum - value;
                value = value + 1;
            }
            else {
                value = value + 1;
            }
        }
        System.out.print(sum);
    }
}
