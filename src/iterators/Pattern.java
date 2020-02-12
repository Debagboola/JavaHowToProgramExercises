package iterators;

public class Pattern {
    public static void main(String[] args) {
        int x = 1;
        for (int v = 1; v <= 5; v++) {
            for(int z=5; z >= v; z--){
                System.out.print(" ");
            }
            for (int f = 1; f <=x ;f += 1){
                System.out.print(v);
            }
            x = x +2;
            System.out.println();
        }
    }
}