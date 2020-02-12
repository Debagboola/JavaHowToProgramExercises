package iterators;

public class Diamond {
    public static void main(String[] arg){
        int space = 5;
        int star = 1;
        int spaceb = 2;
        int starb = 7;
        for(int i = 1;  i <= 5;i++ ){
            for(int j = 1; j<= space; j++){
                System.out.print(" ");
            }
            for(int k=1; k <= star; k++){
                System.out.print("*");
            }
            space--;
            star +=2;
            System.out.println();
        }
        for(int i = 1;  i <= 4;i++ ){
            for(int j = 1; j<= spaceb; j++){
                System.out.print(" ");
            }
            for(int k=1; k <= starb; k++){
                System.out.print("*");
            }
            spaceb++;
            starb -=2;
            System.out.println();
        }
    }
}
