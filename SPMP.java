import java.util.Scanner;
public class SPMP
{
    public static void main( String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float markedprice;
        float sellingprice;
        char categories;
        System.out.println("Enter the marked price of the item");
        markedprice = sc.nextFloat();
        
        System.out.println("Enter the category of the item");
        categories = sc.next().charAt(0);
         switch (categories) {
            case 'A':
                sellingprice = markedprice - (markedprice * 0.60f);
                break;
            case 'B':
                sellingprice = markedprice - (markedprice * 0.40f);
                break;
            case 'C':
                sellingprice = markedprice - (markedprice * 0.20f);
                break;
            case 'D':
                sellingprice = markedprice - (markedprice * 0.10f);
                break;
            default:
                System.out.println("Invalid category.");
                return;
        }

        System.out.println("Selling Price is " + sellingprice);
    }
}

