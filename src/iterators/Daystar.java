package iterators;

public class Daystar {
    public static void main(String[] arg){
        int star1 = 1;
        int sp2 = 5;
        int sp3 = 1;
        int star4 = 5;
        int sp5 = 5;
        int star6 = 1;
        int star7 = 5;

        for( int i = 1; i<= 5 ; i++ ){
            for(int j = 1; j <= star1; j++){
                System.out.print("*");
            }
            for(int k=1; k <= sp2; k++){
                System.out.print(" ");
            }
            for( int l=1; l <=sp3; l++){
                System.out.print(" ");
            }
            for(int m = 1; m <= star4; m++){
                System.out.print("*");
            }
            for(int n = 1; n <= sp5; n++){
                System.out.print(" ");
            }
            for(int o = 1; o <= star6; o++){
                System.out.print("*");
            }
            for(int p = 1; p <= star7; p++){
                System.out.print("*");
            }
            star1++;
            sp2--;
            sp3++;
            star4--;
            sp5--;
            star6++;
            star7--;
            System.out.println();
        }
    }
}
