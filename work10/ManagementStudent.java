package work10;
public class ManagementStudent extends Student 
{
    public ManagementStudent(int rollNo, String name, double marks) 
    {
        super(rollNo, name, marks);
    }
    @Override
    public String calculateResult() 
    {
        double adjustedMarks = getMarks() + 3; 
        return super.calculateResult(); 
    }
    public String calculateResult(int graceMarks) 
    {
        double total = getMarks() + graceMarks;
        return total >= 40 ? "Pass with grace" : "Fail";
    }
    @Override
    public String toString() {
        return super.toString() + " [Management Student]";
    }
}