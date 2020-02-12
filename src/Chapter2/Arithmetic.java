package Chapter2;

/*


*  */

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] arg){
      Scanner input = new Scanner(System.in);
      System.out.println("Input first number: ");
      int int1 = input.nextInt();
      System.out.println("Input second number: ");
      int int2 = input.nextInt();
      System.out.println("Input third number: ");
      int int3 = input.nextInt();

      int smallest = int1;
      if(smallest > int2){
          smallest = int2;
          if(smallest > int3){
              smallest = int3;
          }
      }

      System.out.printf("The smallest number is %d %n", smallest);

      int largest = int1;
      if(largest < int2){
          largest = int2;
          if(largest < int3){
              largest = int3;
          }
      }

      System.out.printf(" The largest number is %d %n", largest);

      System.out.printf("Their sum is %d %nTheir product is %d %nTheir average is %d ", int1 + int2 + int3, int1*int2*int3,(int1 + int2 + int3)/3 );
    }
}
