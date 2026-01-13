package work10;
public class PremiumOrder extends Order {
    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    public double calculateFinalAmount() {
        double baseAmount = super.calculateFinalAmount();
        return baseAmount * 0.9;
    }
}