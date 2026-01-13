package work10;
public class OrderApp {
    public static void main(String[] args) {
        NormalOrder normal = new NormalOrder(101, "Aarav", 5000);
        PremiumOrder premium = new PremiumOrder(102, "Kushal", 8000);

        System.out.println(normal.toString());
        System.out.println("Final Amount: " + normal.calculateFinalAmount());

        System.out.println(premium.toString());
        System.out.println("Final Amount: " + premium.calculateFinalAmount());

        System.out.println("Normal Order with Discount: " + normal.calculateFinalAmount(500));
        System.out.println("Premium Order with Discount: " + premium.calculateFinalAmount(1000));
    }
}