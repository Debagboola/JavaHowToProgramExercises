package iterators;
/*
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.
Steps:
 create scanner class
 ask user for input, store user input in value variable
 create counter class
 for (counter = 1, counter <= 12, counter ++){
    printf("%d * %d = %d", value, counter, value*counter)
    counter++
 }
*/
import java.util.Scanner;
public class Ass1{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("     MULTIPLICATION TABLE");
        System.out.print("Input number here: ");
        int value = input.nextInt();
        int counter = 1;
        for(counter = 1; counter <= 12; counter++ ){
            System.out.printf("%d * %d = %d %n", value,counter, value*counter);
        }
    }
}

