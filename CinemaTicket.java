import java.util.Scanner;
public class CinemaTicket
{
    public static void main( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        double Bprice;
        String moviel;
        boolean isFestival;
        boolean isStudent;
        System.out.println("Enter the age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("What language is the movie?:");
        moviel = sc.nextLine();
        System.out.println("Is the viewer a student?");
        isStudent = sc.nextBoolean();
        System.out.println("Is it a festive month?");
        isFestival = sc.nextBoolean();
        if (age <=  18)
        {
           Bprice = 150; 
        }
        else if (age > 18 && age <60){
            Bprice = 250;
        }
        else {
            Bprice = 200;
        }
        if (moviel == "Hindi"){
            Bprice = 50 + Bprice;
        }
        else if (moviel == "English"){
            Bprice = 100 + Bprice;
        }
        if (isStudent == true)
        {
            Bprice = Bprice - 0.2 * Bprice;
        }
        if (isFestival == true)
        {
            Bprice = Bprice -0.15 * Bprice;
        }
        System.out.println("=========================================================================================================================================");
        System.out.println("TOTAL PRICE :" + Bprice);
        System.out.println("=========================================================================================================================================");
    }
}