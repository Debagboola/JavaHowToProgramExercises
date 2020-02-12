package iterators;
/*
Write a program that generates a  random number and asks the user to guess what the number is.
if the user's guess is higher than the random number, the program should display "Too high, try again".
if the user's guess lower than the random number, print ("too low, try again")
*/
import java.security.SecureRandom;
import java.util.Scanner;
public class Ass4 {
    public static void main(String[] arg){
        SecureRandom random = new SecureRandom();
        int value = random.nextInt( 10);
        System.out.printf("GUESSING GAME!!! %n I am thinking of a number between 1 and 10. Guess the number: %n");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        while(guess > 0){
            if(guess == value){
                System.out.print("Genius!!!");
                break;
            }
            while ( guess != value){
                if( guess > value){
                    System.out.println("Too high, try again");
                    guess = input.nextInt();
                }
                else if( guess < value){
                    System.out.println("Too low, try again");
                    guess = input.nextInt();
                }
            }


        }

    }


}
