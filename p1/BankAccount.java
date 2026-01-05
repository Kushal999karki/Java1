package p1;
public class BankAccount
{
    int accnumber;
    String accHolderName;
    double balance;
    BankAccount( int accnumber, String accHolderName, double balance)
    {
        this.accnumber = accnumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }
    void deposit (double amount)
    {
        if (amount > 0)
        {
            balance = balance + amount;
        }
    }

    public double getBalance() 
    {
        return balance;
    }

    }
