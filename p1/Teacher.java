package p1;
public class Teacher extends Person {
    String subject;
    double bonus;
    Teacher(int id, String name, double basicsalary, String subject, double bonus) 
    {
        super(id, name, basicsalary);
        this.subject = subject;
        this.bonus = bonus;
    }
    public double calculateAnnualSalary() 
    {
        return super.calculateAnnualSalary() + bonus;
    }
}