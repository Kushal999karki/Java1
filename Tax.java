import java.util.Scanner;
public class Tax
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int income;
        double tax;
        System.out.println("Enter the individual's income");
        income = sc.nextInt();
        if (income <= 500000)
        {
            tax = 0.01 * income;
        }
        else if (income > 500000 && income<= 700000)
        {
            tax = 5000 + 0.1 * income;
        }
        else if (income > 700000 && income<= 1000000)
        {
            tax = 15000 + 0.2 * income;
        }
        else if (income > 1000000 && income<= 2000000)
        {
            tax = 35000 + 0.3 * income;
        }
        else if (income > 2000000 && income<= 5000000)
        {
            tax = 335000 + 0.36 * income;
        }
        else  
        {
            tax = 1135000 + 0.39 * income;
        }
        System.out.println("The tax needed to pay is: " + tax );   
    }
}