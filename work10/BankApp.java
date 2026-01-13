package work10;
public class BankApp 
{
    public static void main(String[] args) 
    {
        SavingsAccount sa = new SavingsAccount(1001, "Kushal", 50000.0);
        CurrentAccount ca = new CurrentAccount(2002, "Arjun", 75000.0);
        System.out.println("Savings Account:");
        System.out.println(sa.toString());
        System.out.println("Interest (default): " + sa.calculateInterest());
        System.out.println("Interest (custom rate 6%): " + sa.calculateInterest(0.06));
        System.out.println("Current Account:");
        System.out.println(ca.toString());
        System.out.println("Interest (default): " + ca.calculateInterest());
        System.out.println("Interest (custom rate 4.5%): " + ca.calculateInterest(0.045));
    }
}