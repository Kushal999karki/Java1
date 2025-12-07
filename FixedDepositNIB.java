
import java.util.Scanner;
public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double FEE_RATE = 0.005; 
        final int MIN_DEPOSIT = 1000;
        final int MAX_YEARS = 5;
        System.out.println("=== Fixed Deposit Calculator (NIB) ===");
        System.out.print("Enter number of FDs to calculate: ");
        int n = sc.nextInt();
        int count = 1; 
        while (count <= n) {   
            System.out.println("\nFD #" + count);
            System.out.print("Enter deposit amount (>= Rs.1000): ");
            double P = sc.nextDouble();
            if (P < MIN_DEPOSIT) {
                System.out.println("Deposit must be at least Rs.1000. Skipping this FD.");
                count++;
                continue; 
            }
            System.out.print("Enter duration in years (<= 5): ");
            int years = sc.nextInt();
            if (years > MAX_YEARS || years <= 0) {
                System.out.println("Duration must be between 1 and 5 years. Skipping this FD.");
                count++;
                continue;
            }
            System.out.print("Enter annual interest rate (8–12%): ");
            double annualRate = sc.nextDouble();
            if (annualRate < 8 || annualRate > 12) {
                System.out.println("Annual rate must be between 8% and 12%. Skipping this FD.");
                count++;
                continue;
            }
            int months = years * 12;
            double monthlyRate = annualRate / 12 / 100; 
            double A = P * Math.pow(1 + monthlyRate, months); 
            double fee = A * FEE_RATE;
            double finalAmount = A - fee;
            System.out.println("Principal (P): Rs. " + P);
            System.out.println("Annual Rate: " + annualRate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Years: " + years);
            System.out.println("Months: " + months);
            System.out.println("Maturity Amount (A): Rs. " + String.format("%.2f", A));
            System.out.println("Fee Rate: " + (FEE_RATE * 100) + "%");
            System.out.println("Processing Fee: Rs. " + String.format("%.2f", fee));
            System.out.println("Final Amount (after fee): Rs. " + String.format("%.2f", finalAmount));
            count++;
        }
        sc.close();
        System.out.println("\n=== Calculation Completed ===");
    }
}