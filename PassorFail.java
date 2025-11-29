
/**
 * Write a description of class PassorFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;


public class PassorFail
{
    public static void main( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks");
        int num = scan.nextInt();
        if (num >= 50){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}