package work10;
public class CarDelivery extends DeliveryPartner {
    public CarDelivery(int partnerId, String name, double basePay) {
        super(partnerId, name, basePay);
    }
    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 300; 
    }
    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 75); 
    }
    @Override
    public String toString() {
        return super.toString() + "yo manxe Car Delivery ma ";
    }
}