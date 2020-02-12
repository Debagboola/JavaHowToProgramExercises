/*
*create employee class
* create instance variables firstName(String), lastName(String),
and monthlySalary(double)
* create constructor Employee
* Provide a set and a get method for each instance
variable
* If monthlySalary = -ve, set no value
* create test app EmployeeTest
* Create 2 employee objects
* display each object's yearly salary
* give each employee a 10% raise
* display each employee object's yearly salary
*
*/


package Chapter3;

import java.util.Scanner;
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double yearlySalary;



    public Employee(String firstName, String lastName, double monthlySalary)
    {
        this.firstName = firstName;
        this.lastName=lastName;
        this.monthlySalary=monthlySalary;
    }
    public double getYearlySalary() {
        return monthlySalary*12;
    }



    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setFirstName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first Name: ");
        this.firstName = userInput.nextLine();
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary >= 0){
            this.monthlySalary = monthlySalary;
        }
    }
    public double getMonthlySalary(){
        return this.monthlySalary;
    };

}
