package Book;
import java.util.Scanner;
public class BankAccount
{
   int account_number;
   String holder_name;
   double balance;
   
   BankAccount(int account_number, String holder_name, double balance){
       this.account_number = account_number;
       this.holder_name = holder_name;
       this.balance = balance;
   }
   void deposit(){
       Scanner sc = new Scanner(System.in);
       double deposit;
       System.out.println("Enter the amount to deposit:");
       deposit = sc.nextDouble();
       sc.nextLine();
       balance = deposit +  balance;
       System.out.println("Your amount has been deposited");
       sc.nextLine();
   }
   void withdraw(){
       Scanner sc = new Scanner(System.in);
       double withdraw;
       System.out.println("Enter the amount to withdraw:");
       withdraw = sc.nextDouble();
       sc.nextLine();
       balance = balance - withdraw;
       System.out.println("Your amount has been withdrawn");
       sc.nextLine();
   }
   void display(){
       System.out.println("Your current balance is " + balance);
    }
}