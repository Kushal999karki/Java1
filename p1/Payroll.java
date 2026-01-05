package p1;
public class Payroll
{
    public static void main(String [] args)
    {
        PermanentEmployee p1 = new PermanentEmployee(12,"Ramesh",45000,1200,2000);
        ContractEmployee c1 = new ContractEmployee(23,"Ganesh",14000,7);
        
        System.out.println("Permanent Employee Details:");
        p1.displayEmployee();
        System.out.println("FINAL SALARY:" + p1.calculateTotalSalary());
        
        System.out.println("Contract Employee Details:");
        c1.displayEmployee();
        System.out.println("FINAL SALARY:" + c1.calculateTotalSalary());
    }
}