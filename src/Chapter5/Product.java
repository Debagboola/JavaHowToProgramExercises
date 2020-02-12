package Chapter5;

public class Product {
    public static void main(String[] ar){
        long a= 1;
        long b = 1;
        for(int count = 1; count <= 20 ; count++){
            if(count % 2 != 0){
                a = a * count;
            }
            else{
                b = b * count;
            }
        }
        System.out.printf("The product of the odd numbers is %d %n", a);
        System.out.printf("The product of the even numbers is %d %n", b);
    }

}
