package Chapter4;
/*
print out the diagram below:
*
* *
* * *
* * * *

while counter is initially  0,as long as counter is less than 4:
concatenate string " *" with variable value which has its initial value as null or "";


 */
public class PrintStar {
    public static void main(String[] args){
        int counter = 0;
        String value = "";

        while (counter <4){
            value = value + " *";
            counter++;
            System.out.println(value);
        }
    }
}
