package iterators;
/* 28th of January, 2020 write a code that outputs this structure below:
    1
   212
  32123
 4321234
543212345

Steps:



*/

public class Ass3 {
    public static void main (String[] args){
        int space = 5;
        int star1 = 5;
        int star2 = 1;

        for(int c=1; c <= 5; c++){
            for(int i = 1; i <= space; i++){
                System.out.print(" ");
            }
            for(int j = 5; j >= star1; j-- ){
                System.out.print(j);
            }
            for(int k = 2; k <= star2;k++ ){
                System.out.print(k);
            }
            space--;
            star1--;
            star2++;
            System.out.println();
        }
    }

}
