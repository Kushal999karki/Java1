package p1;
public class car extends Vehicle
{
    int numberOfDoors;
    String fueltype;
    car(int vehicleId, String brand, double BasePrice, int numberOfDoors, String fueltype)
    {
        super(vehicleId,brand,BasePrice);
        this.numberOfDoors = numberOfDoors;
        this.fueltype = fueltype;
    }
    public double calculateFinalPrice() {
        double tax = Tax();
        double luxuryCharge = BasePrice * 0.05;
        return BasePrice + tax + luxuryCharge;
    }

}