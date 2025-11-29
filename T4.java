
/**
 * Write a description of class T4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class T4
{
    public static void main(String [] args)
    {
        int num =4;
        
        if( num % 3 == 0)
        {
            if (num % 5 == 0)
            {
                System.out.println("Divisible by both 3 and 5");
                
            }
            else{
                System.out.println("Divisible by 3 and not by 5");
            }
        }
        else{
            System.out.println("Divisible by neither");
        }
    }
}