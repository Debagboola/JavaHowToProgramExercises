package Chapter2;
/*
Pseudocode;* */

import java.util.Scanner;
public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 5 digit number:");
        int number = input.nextInt();
        int e = number % 10;
        int d = (number % 100)/10;
        int c = (number % 1000)/100;
        int b = (number % 10000)/1000;
        int a = (number % 100000)/10000;
        System.out.printf("The numbers are spaced here:%d   %d   %d   %d   %d", a,b,c,d,e);

    }
}
