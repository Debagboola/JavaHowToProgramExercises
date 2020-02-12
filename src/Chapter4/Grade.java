package Chapter4;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("input student score: ");
        int studentGrade = input.nextInt();
        if(studentGrade >= 90){
            System.out.print("A");
        }
        else {
            if(studentGrade >= 80){
                System.out.print("B");
            }
            else{
                if(studentGrade >= 70){
                    System.out.print("C");
                }
                else{
                    if(studentGrade >= 60){
                        System.out.print("D");
                    }
                    else{
                        System.out.print("F");
                    }
                }
            }
        }
    }
}
