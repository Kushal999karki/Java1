package p1;
public class savingaccount extends BankAccount
{
    double interestrate;
    savingaccount( int accnumber, String accHolderName, double balance, double interestrate)
    {
        super(accnumber, accHolderName, balance);
        this.interestrate = interestrate;
    }
    double calculateInterest()
    {
        double interest = super.getBalance() * interestrate / 100;
        return (interest);
    }
}