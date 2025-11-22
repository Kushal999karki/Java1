import java.util.Scanner;
/*
* @author (Kushal Raj Pathak);
*/
public class RickshawFare 
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in); 
        int BASE_FARE = 60;       
        int FARE_PER_KM = 15;    
        int FARE_PER_MIN = 3;
        double LOCAL_DISCOUNT = 0.15; 
        double NIGHT_CHARGE = 0.10;
        int LONG_DISTANCE_THRESHOLD = 10;
        
        System.out.println("How far is  the distance?");
        double distance= scan.nextDouble();
        scan.nextLine();
        System.out.println( "The distance is " + distance + " km");
        
        System.out.println("How long is the ride?");
        int time= scan.nextInt();
        System.out.println( "The ride is " + time + " minutes");
        
        System.out.println("Is the customer local? ");
        String localInput = scan.next();
        boolean isLocal = localInput.equalsIgnoreCase("yes") ? true : false;
        String Local = isLocal ? "YES" : "NO";
        System.out.println("Local Customer:" + Local);
        
        System.out.println("Is it night time? ");
        String timeInput = scan.next();
        boolean isNight = timeInput.equalsIgnoreCase("yes") ? true : false;
        String Time = isNight ? "YES" : "NO";
        System.out.println("NIGHT:" + Time);
                
        double fare = BASE_FARE + (distance * FARE_PER_KM) + (time * FARE_PER_MIN);
        fare = (isLocal && distance > LONG_DISTANCE_THRESHOLD) ? fare * (1 - LOCAL_DISCOUNT) : fare;
        fare = isNight ? fare * (1 + NIGHT_CHARGE) : fare;
        
        System.out.println("=========================================");
        System.out.println("Final Amount: Rs. " + fare);
        System.out.println("=========================================");
        scan.close();
    }
}

     
   