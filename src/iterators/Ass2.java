package iterators;

public class Ass2 {
    public static void main(String[] arg){
        int space = 5;
        int star = 1;
        for(int i = 1;  i <= 5;i++ ){
            for(int j = 1; j<= space; j++){
                System.out.print(" ");
            }
            for(int k=1; k <= star; k++){
                System.out.print(i);
            }
            space--;
            star +=2;
            System.out.println();
        }

    }
}
