package iterators;

import java.util.Scanner;
public class Ass5 {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        int value;
       do{
          System.out.println("input first number: ");
          int num1 = input.nextInt();
          System.out.print("input second number: ");
          int num2 = input.nextInt();
          System.out.printf("the sum of the numbers is %d %n ", num1 + num2);
          System.out.print("press 1 to perform this operation again. press 0 to terminate this operation ");
           value = input.nextInt();
       }while(value == 1);
    }
}
