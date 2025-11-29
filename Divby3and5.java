
public class Divby3and5
{
    public static void main( String [] args)
    {
        int num= 2;
        if (num % 3 == 0)
        {
            if (num % 5 == 0)
            {
                System.out.println("It is divisible by both 3 and 5");
            }
            else{
                System.out.println("It is divisible by  3 and not 5");
            }
        }
        else{
            System.out.println("It is not divisible by  3 and  5");
        }
    }
}