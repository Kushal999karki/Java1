package p1;
public class PermanentEmployee extends Employees
{
    double hra;
    double da;
    
    PermanentEmployee(int empID, String name, double basicsalary, double hra, double da)
    {
        super(empID,name,basicsalary);
        this.hra = hra;
        this.da = da;
    }
    double calculateTotalSalary()
    {
        double total = this.basicsalary + hra + da + calculateBonus();
        return (total);
    }
}