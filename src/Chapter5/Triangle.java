package Chapter5;

public class Triangle {
    public static void main(String[] arg){
        for(int i = 1; i <= 10;i++){
            for(int x = i-1; x <= 9; x++){
                System.out.print("s");
            }
            for(int y = 10  ; y > 0; y--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
