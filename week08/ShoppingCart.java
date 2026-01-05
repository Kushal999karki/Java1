package week08;
public class ShoppingCart {
    private String itemName;
    private double itemPrice;
    private int quantity;
    public ShoppingCart(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
            this.quantity = quantity;
    }
    public double calculator() {
        return itemPrice * quantity;
    }
    public double calculateDiscountedTotal(double discount) {
        double total = calculator();
        double discountAmount = total * (discount/ 100);
        return total - discountAmount;
    }
    public void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculator());
    }
}