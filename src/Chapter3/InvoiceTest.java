package Chapter3;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice Invoice1 = new Invoice(" "," ",0, 0.0);
        //Scanner input = new Scanner(System.in);

        //Invoice1.setNumber();
        //Invoice1.setDescription();

        //Invoice1.getNumber();
        //Invoice1.setDescription();

        Invoice1.setPrice(500);
        Invoice1.setQuantity(20);
        Invoice1.getInvoiceAmount(500,10);



    }
}
