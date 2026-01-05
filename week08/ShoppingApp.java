package week08;
public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Laptop", 80000, 2);
        cart.displayCart();
        cart.setQuantity(3);
        cart.displayCart();
        double discountedTotal = cart.calculateDiscountedTotal(10);
        System.out.println("\nDiscounted Total (10% off): " + discountedTotal);
    }
}