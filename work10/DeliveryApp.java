package work10;
public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery bikeGuy = new BikeDelivery(101, "Ganesh", 1000.0);
        CarDelivery carGal = new CarDelivery(202, "Kushal", 1200.0);
        System.out.println("Bike Delivery Partner:");
        System.out.println(bikeGuy.toString());
        System.out.println("Payment (no extra orders): " + bikeGuy.calculatePayment());
        System.out.println("Payment (with 3 extra orders): " + bikeGuy.calculatePayment(3));
        System.out.println("Car Delivery Partner:");
        System.out.println(carGal.toString());
        System.out.println("Payment (no extra orders): " + carGal.calculatePayment());
        System.out.println("Payment (with 2 extra orders): " + carGal.calculatePayment(2));
    }
}