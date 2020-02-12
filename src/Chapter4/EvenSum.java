package Chapter4;/*
Write a code that sums up the first 10 even numbers

create an integer even with an initial value of

calculate the sum of the first 10 even numbers , then

*/

import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input the total number of even numbers you want to sum:");
        int number = input.nextInt();

        int count = 0;
        int value = 0;

        int sum = 0;
        while ( count <= number){
            sum = sum + value;

            value = value + 2;
            count = count + 1;
        }
        System.out.printf("The sum of the first %d even numbers is %d", number, sum);
    }
}
