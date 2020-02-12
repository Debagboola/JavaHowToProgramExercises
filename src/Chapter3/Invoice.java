package Chapter3;
/*
create a class named Invoice.
create four instance variables ( number- string, description-string, quantity- int, price- double).
create a constructor that initializes the four instance variables.
create set method for number.
create get method for number.
create set method for description.
create get method for description.
create set method for quantity.
create get method for quantity.
create set method for price.
create get method for price.
create new method called getInvoiceAmount to calculate invoice amount.
create instance variable totalAmount.
in the getInvoiceAmount method put in the body the code that multiplies quantity by price.

put the return type of getInvoiceAmount as double.
if quantity is negative, set quantity as 0
if price is negative, set price as 0.0


create driver class called InvoiceTest


*/


import java.util.Scanner;

public class Invoice{
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    Scanner input = new Scanner(System.in);

    public void setNumber(){

        System.out.println("Enter Number");

        number = input.nextLine();
        this.number=number;
    }

    public String getNumber(){
        return number;
    }


    public void setDescription(){
        System.out.println("Enter Description");

        description = input.nextLine();
        this.description=description;
    }

    public String getDescription(){
        return description;
    }


    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }


    public double getInvoiceAmount(double price, int quantity){

        double totalAmount =0;

        totalAmount = price * quantity;

        if(price < 0.) price = 0.0;

        if(quantity < 0) quantity = 0;

        System.out.printf("Total Amount is %.2f", totalAmount);

        return totalAmount;

    }


}
