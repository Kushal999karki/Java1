package week07;
public class Laptop
{
    String brand;
    int RAM;
    double price;
    Laptop(String brand, int RAM, double price)
    {
        this.brand = brand;
        this.RAM = RAM;
        this.price = price;
    }
    void display()
    {
        if (this.RAM > 8){
            System.out.println(this.brand + this.RAM + ":" + this.price);
        }
    }
}