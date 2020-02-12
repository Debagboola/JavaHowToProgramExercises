package Chapter3;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Taofeek", "Hammed", 50000);
        Employee employee2 = new Employee("Debora", "Agboola ", 75000*12);

        System.out.println("employee1 name: "+ employee1.getFirstName() );
        employee1.setFirstName("Joshua");
        System.out.println("employee1 name: "+ employee1.getFirstName() );

        employee1.setFirstName();

        System.out.println("employee1 name: "+ employee1.getFirstName() );
//        System.out.printf("%s's  monthly salary is %f, and %s's monthly salary is %f", employee1.getFirstName(), employee1.getMonthlySalary(), employee2.getFirstName(), employee2.getMonthlySalary());
//        System.out.printf("%s's  yearly salary is %f, and %s's yearly salary is %f", employee1.getFirstName(), employee1.getMonthlySalary(), employee2.getFirstName(), employee2.getMonthlySalary());


    }
}
