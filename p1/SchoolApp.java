package p1;
public class SchoolApp {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(101, "Kushal", 50000, "Mathematics", 10000);
        System.out.println("Teacher Annual Salary: " + t1.calculateAnnualSalary());
        Staff s1 = new Staff(102, "Dhoom", 30000, 60, 200);
        System.out.println("Staff Salary: " + s1.calculateSalary());
        System.out.println("College Name: " + Person.collegename);
    }
}