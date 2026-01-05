package p1;
public class BankApp {
    public static void main(String[] args) {
        savingaccount s1 = new savingaccount(0023, "Kushal", 1000, 5.0);
        s1.deposit(500);
        System.out.println("Savings Balance: " + s1.getBalance());
        System.out.println("Interest Earned: " + s1.calculateInterest());
        currentaccount c1 = new currentaccount(79, "Kushal", 1000, 300);
        c1.deposit(200);
        System.out.println("Current Balance: " + c1.getBalance());
        System.out.println("Current Balance after withdrawal: " + c1.getBalance());
        c1.withdraw(500); 
        System.out.println("Current Balance after failed withdrawal: " + c1.getBalance());
    }
}
