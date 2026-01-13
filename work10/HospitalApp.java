package work10;
public class HospitalApp {
    public static void main(String[] args) {
        Doctor doc = new Doctor(101, "Dr. KIshore Sharma Lal", "Cardiology", 1500.0);
        Nurse nurse = new Nurse(201, "Nurse Ali", "Night", 800.0);
        System.out.println("Doctor Details:");
        System.out.println(doc.toString());
        System.out.println("Salary (no emergencies): " + doc.calculateSalary());
        System.out.println("Salary (with 3 emergencies): " + doc.calculateSalary(3));
        System.out.println("Nurse Details:");
        System.out.println(nurse.toString());
        System.out.println("Salary: " + nurse.calculateSalary());
    }
}