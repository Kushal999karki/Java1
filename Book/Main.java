package Book;

public class Main{
    
    public static void main()
    {
        BankAccount b1 = new BankAccount(9979,"Kushal",67000);
        BankAccount b2 = new BankAccount(8577,"Saswot",89000);
        b1.display();
        b1.deposit();
        b1.display();
        b1.withdraw();
        b1.display();
        b2.display();
        b2.deposit();
        b2.display();
        b2.withdraw();
        b2.display();
    }
}
