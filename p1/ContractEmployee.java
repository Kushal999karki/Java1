package p1;
public class ContractEmployee extends Employees
{
    int workingDays;
    
    ContractEmployee(int empID, String name, double basicsalary,int workingDays)
    {
        super(empID,name,basicsalary);
        this.workingDays = workingDays;
    }
    double calculateTotalSalary()
    {
        double total = this.basicsalary * this.workingDays;
        return (total);
    }
}