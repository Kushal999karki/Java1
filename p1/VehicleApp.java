package p1;
public class VehicleApp
{
    public static void main(String [] args)
    {
        bike b1 = new bike(001,"Pulsar",323000,155);
        car c1 = new car(001,"Santro",2396000,4,"petrol");
        
        System.out.println("Car:");
        c1.displayVehicleInfo();
        System.out.println("TAX :" + c1.Tax());
        System.out.println("FINAL PRICE: " + c1.calculateFinalPrice());
        
        System.out.println("Bike:");
        b1.displayVehicleInfo();
        System.out.println("TAX :" + b1.Tax());
        System.out.println("FINAL PRICE: " + b1.calculateFinalPrice());
    }
}