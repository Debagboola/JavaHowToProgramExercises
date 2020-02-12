package iterators;
//31st Jan, 2020
// write a program that prompts user to input +ve integer.
// your program should determine whether the number is prime.
import java.util.Scanner;
public class Ass6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("<-- PRIME NUMBER INDICATOR -->");
        System.out.print("Input a number: ");
        int value = input.nextInt();
        if( (value % 2 !=0) || (value % 3 != 0 )|| (value % 5 != 0) || (value % 7 != 0) || (value % 11 !=0)){
            System.out.printf("%d is a prime number", value);
        }
        else{
            System.out.printf("%d is not a prime number", value);
        }
    }
}
