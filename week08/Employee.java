package week08;
public class Employee {
    private double basicSalary;
    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double calculator() {
        return basicSalary + (0.20 * basicSalary);
    }
    public double getBasicSalary() {
        return basicSalary;
    }
}
