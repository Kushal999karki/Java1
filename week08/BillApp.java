package week08;
public class BillApp {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill("Kushal", 150);
        bill.displayBill();
        bill.setUnitsConsumed(80);
        bill.displayBill();
    }
}
