
import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numeric grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine();
        String result = (grade >= 40) ? "Pass" : "Fail";
        System.out.println("Your grade:" + grade);
        System.out.println("Status:" + result);
    }
}

