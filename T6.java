
/**
 * Write a description of class T6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class T6
{
    public static void main(String [] args)
    {
        int[] age; // declaring an array
        age = new int[5]; //constructing an array
        
        System.out.println(age.length);
        
        age[0]= 10; // initializing an array elements
        age[1]= 20;
        age[2]= 14;
        age[3]= 34;
        age[4]= 40;
        
        int firstElement= age[0];
        System.out.println(firstElement);
        int lastElement= age[4];
        System.out.println(lastElement);
        
        
        int[] agr= {10,20,14,34,40};
        
        int sum=0;
        
        for(int i=0; i< agr.length;i++)
        {
            sum=sum+agr[i];
            System.out.println(agr[i]);
            
        }
        
        for(int i=4; i> agr.length;i--)
        {
            System.out.println(sum);
        }
    }
}



















