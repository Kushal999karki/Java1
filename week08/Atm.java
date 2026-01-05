package week08;
public class Atm {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(677,9000, "Kushal");
        account.deposit(5600);
        account.withdraw(200);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
