package week09;
public class Car extends Vehicle
{
    private int doors;
    public Car(String brandname, int maxSpeed, int doors)
    {
        super(brandName,maxSpeed);
        this.doors=doors;
    }
    public void displayDetails()
    {
        System.out.println(" Car brand Name: "+ super.brandName);
        System.out.println(" Car Max Speed: "+ super.maxSpeed);
        System.out.println(" Number of doors in the car: "+ this.doors);
    }
}