package p1;
public class Vehicle
{
    int vehicleId;
    String brand;
    double BasePrice;
    Vehicle(int vehicleId, String brand, double BasePrice)
    {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.BasePrice = BasePrice;
    }
    void displayVehicleInfo()
    {
        System.out.println("VEHICLE ID :" + this.vehicleId);
        System.out.println("BRAND :" + this.brand);
        System.out.println("BASEPRICE :" + this.BasePrice);
    }
    double Tax()
    {
        return (0.10 * this.BasePrice);
    }
}