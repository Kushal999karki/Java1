package p1;
public class bike extends Vehicle
{
    int engineCapacity;
    bike(int vehicleId, String brand, double BasePrice, int engineCapacity)
    {
        super(vehicleId,brand,BasePrice);
        this.engineCapacity = engineCapacity;
    }
    double calculateFinalPrice()
    {
        double tax = Tax();
        return BasePrice + tax;
    }
}
