package Chapter3;

public class Account {
    private String name;
    private double balance;


    public Account(String name, double balance)
    {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }
    public void deposit(double depositAmount){
        if (depositAmount > 0.0)
            balance =balance + depositAmount;
    }
    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public void withdraw(double cashOut){
        if(cashOut>balance) {
            System.out.print("withdrawal amount exceeded account balance");
        }
        balance = balance - cashOut;
    }
}
