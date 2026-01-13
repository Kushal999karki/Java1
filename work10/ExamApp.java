package work10;
public class ExamApp {
    public static void main(String[] args) {
        ScienceStudent s1 = new ScienceStudent(101, "Muti", 38.0);
        ManagementStudent m1 = new ManagementStudent(99, "Rodip", 42.0);
        System.out.println("Science Student:");
        System.out.println(s1.toString());
        System.out.println("Result (default): " + s1.calculateResult());
        System.out.println("Result (with 4 grace marks): " + s1.calculateResult(4));

        System.out.println("Management Student:");
        System.out.println(m1.toString());
        System.out.println("Result (default): " + m1.calculateResult());
        System.out.println("Result (with 2 grace marks): " + m1.calculateResult(2));
    }
}