package p1;
public class Staff extends Person {
    int workinghours;
    double rateperhour;
    Staff(int id, String name, double basicsalary, int workingHours, double ratePerHour) 
    {
        super(id, name, basicsalary);
        this.workinghours = workinghours;
        this.rateperhour = rateperhour;
    }
    double calculateSalary() 
    {
        return workinghours * rateperhour;
    }
}
