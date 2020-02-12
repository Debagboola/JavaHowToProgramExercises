package Chapter5;
/*
* int counter = 1
* int result = 0
* as far as counter is less than 20:
* add counter to (counter + 1)
* add 7 to the result
* is result = 21?
* if yes, break
* if not, result = 0
* counter ++
 */
public class Classwork1 {
    public static void main(String[] args){
        int int1 = 1;
        int int2 = 2;
        int result = 0;
        int counter = 0;
        while(counter <= 20){
            counter++;
            result = int1 + int2 + 6;
            System.out.println(result);
            if(result == 21){
                continue;
            }
          int1++;
          int2++;
        }
    }
}
