package Chapter5;
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly input the number of values you want to compare: ");
        int value = input.nextInt();

        int  number = 999999999;
        int smallest = number;
        int largest = -999999999;
        System.out.println("Type in the numbers you want to compare: ");

        for(int counter = 1; counter <= value; counter++){
            number = input.nextInt();
            if (number < smallest){
                smallest = number;
            }
            if(number > largest){
                largest = number;
            }


        }
        System.out.printf("The smallest number is %d", smallest );
        System.out.println();
        System.out.printf("and the largest number is %d.", largest);
    }
}
