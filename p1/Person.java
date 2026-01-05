package p1;
public class Person {
    int id;
    String name;
    double basicsalary;
    static String collegename = "Islington College";

    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicsalary = basicSalary;
    }

    public double calculateAnnualSalary() {
        return basicsalary * 12;
    }
}
