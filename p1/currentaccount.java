package p1;
public class currentaccount extends BankAccount
{
    double overdraftlimit;
    currentaccount( int accnumber, String accHolderName, double balance, double overdraftlimit)
    {
        super( accnumber,accHolderName,balance);
        this.overdraftlimit = overdraftlimit;
    }
    boolean withdraw(double amount) {

        if (amount <= balance + overdraftlimit) {
            balance = balance - amount;  
            return true;        
        } else {
            return false;       
        }
    }

}