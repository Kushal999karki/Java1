import java.util.Scanner;
public class Districts {
    public static void main(String[] args) {
        String[] district = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};
        for (int i = 0; i < district.length; i++) {
            System.out.println((i + 1) + ". " + district[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of districts: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        district= new String[n];
        System.out.println("Enter " + n + " district names:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". ");
            district[i] = sc.nextLine();
        }

        System.out.println("The Districts now are :");
        for (int i = 0; i < district.length; i++) {
            System.out.println((i + 1) + "  " + district[i]);
        }
    }
}