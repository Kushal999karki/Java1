
public class dosquare
{
    public static void main(String [] args)
    {
        int i=1;
        int j= 0;
        do{
            j=j+(i * i);
            i++;
        }
        while(i <= 10);
        System.out.println(" " + j);
    }
}