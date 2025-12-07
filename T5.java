import java.util.Scanner;
public class T5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range= sc.nextInt();
        for(int i=1;i<=3;i++)
        {
            for(int j=1; j<=2;j++)
            {
                System.out.println("i: "+ i +" j: "+ j);
            }
            System.out.println();
        }
        
    }
}