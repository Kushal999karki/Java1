package p1;
public class Employees
{
    int empID;
    String name;
    double basicsalary;
    
    Employees( int empID, String name, double basicsalary)
    {
        this.empID = empID;
        this.name = name;
        this.basicsalary = basicsalary;
    }
    double calculateBonus()
        {
            return (0.10 * basicsalary);
        }
        void displayEmployee()
        {
            System.out.println("ID : " + this.empID);
            System.out.println("NAME : " + this.name);
            System.out.println("BASIC SALARY : " + this.basicsalary);
        }
}