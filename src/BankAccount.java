//encapsulation - hide data inside the class and only access it via the methods
public class BankAccount {
    private double balance;
    public void deposit(double amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }
}
