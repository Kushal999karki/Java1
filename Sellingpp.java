import java.util.Scanner;
public class Sellingpp
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float markedprice;
        float sellingprice;
        char categories;
        System.out.println("Enter the marked price of the item");
        markedprice = sc.nextFloat();
        
        System.out.println("Enter the category of the item");
        categories = sc.next().charAt(0);
        if (categories == 'A')
        {
            sellingprice =markedprice -(markedprice*0.6f);
             System.out.println("The selling price is" + sellingprice);
        }
        else if (categories == 'B')
        {
            sellingprice =markedprice -(markedprice*0.4f);
             System.out.println("The selling price is" + sellingprice);
        }
        else if (categories == 'C')
        {
            sellingprice =markedprice -(markedprice*0.2f);
             System.out.println("The selling price is" + sellingprice);
        }
        else if 
            (categories == 'D')
        {
            sellingprice =markedprice -(markedprice*0.1f);
             System.out.println("The selling price is" + sellingprice);
        }
        else {
            System.out.println("Invalid category");
        }
        }
    }
