package week08;
public class BankAccount
{
    private int accountNumber;
    private double balance;
    private String name;
    BankAccount(int accountNumber,double balance,String name){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
    }
    public boolean withdraw(double amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            return true;
    }
}
