package work10;
public class CurrentAccount extends Account {
    public CurrentAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }
    @Override
    public double calculateInterest()
    {
        return super.calculateInterest() + getBalance() * 0.01; 
    }
    public double calculateInterest(double rate) 
    {
        return getBalance() * rate;
    }
    @Override
    public String toString() 
    {
        return super.toString() + " Current Account";
    }
}