package week08;
public class ElectricityBill {
    private String consumerName;
    private int unitsConsumed;
    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
    public int getUnitsConsumed() {
        return unitsConsumed;
    }
    public void setUnitsConsumed(int unitsConsumed) {
        if (unitsConsumed >= 0) {
            this.unitsConsumed = unitsConsumed;
        } else {
            System.out.println("Units consumed cannot be negative.");
        }
    }
    public double calculateBill() {
        double billAmount;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 8);
        }
        return billAmount;
    }
    public void displayBill() {
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: " + calculateBill());
    }
}

