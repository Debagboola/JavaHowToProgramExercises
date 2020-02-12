package iterators;

import java.util.Scanner;
public class Ass7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a 5 digit number");
        int value = input.nextInt();

        int a = value % 10;
        int b = (value % 100)/10;
        int c = (value % 1000)/100;
        int d = (value % 10000)/1000;
        int e = (value % 100000)/10000;
        System.out.printf("%d%d,%d%d%d%n",a,b,c,d,e);
    }
}
