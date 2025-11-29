import java.util.Scanner;
public class GPAtograde
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        float GPA;
        System.out.println("Enter the value of GPA");
        GPA = sc.nextFloat();
        if (GPA < 0.00){
            System.out.println("Invalid GPA");
        }
        else if (GPA > 3.6){
            System.out.println("A+");
        }
        else if (GPA > 3.2){
            System.out.println("A");
        }
        else if (GPA > 2.8){
            System.out.println("B+");
        }
        else if (GPA > 2.4){
            System.out.println("B");
        }
        else if (GPA < 2.4){
            System.out.println("Fail: not graded");
        }
        else if (GPA > 4.0){
            System.out.println("Invalid GPA");
        }
    }
}