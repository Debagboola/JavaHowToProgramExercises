package Chapter4;
/*
 print out the diagram below:
 *      *
 **    **
 ***  ***
 ********
  this  is the pseudo code to print Star



*/
public class PrintStar2 {
    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 3) {
            int i = 1;
            while (i <= counter) {
                System.out.print("*");
                i = i + 1;

            }
            System.out.println();
            counter++;
        }
    }
}


