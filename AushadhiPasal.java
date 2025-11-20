/**
 * @author (Kushal Raj Pathak)
 */
import java.util.Scanner;

public class AushadhiPasal 
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String medicine1= "NIMS";
        String medicine2= "PARACETAMOL";
        String medicine3= "IBOPROFANE";
        String medicine4= "LINEZOLID";
        String medicine5= "NORETH";
        double  price1= 2.79;
        double  price2= 9;
        double  price3= 9.28;
        double  price4= 54;
        double  price5= 3;
        System.out.println("========================================================================");
        System.out.println("AUSHADHI PASAL PRICE AND STOCK");
        System.out.println("========================================================================");
        System.out.println("PRICE");
        System.out.println("========================================================================");
        System.out.println(medicine1 +": "+ price1);
        System.out.println(medicine2 +": "+ price2);
        System.out.println(medicine3 +": "+ price3);
        System.out.println(medicine4 +": "+ price4);
        System.out.println(medicine5 +": "+ price5);
        System.out.println("========================================================================");
        System.out.println("STOCK AND QUANTITY");
        System.out.println("===========================================================================");
        System.out.println("What is the stock of " +medicine1 + "?");
        int quantity1=scan.nextInt();
        System.out.println("What is the stock of " +medicine2 +"?");
        int quantity2=scan.nextInt();
        System.out.println("What is the stock of " +medicine3 +"?");
        int quantity3=scan.nextInt();
        System.out.println("What is the stock of " +medicine4 +"?");
        int quantity4=scan.nextInt();
        System.out.println("What is the stock of " +medicine5 +"?");
        int quantity5=scan.nextInt();
    }
}

