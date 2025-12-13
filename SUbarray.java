import java.util.Scanner;
public class SUbarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
        System.out.println("Score:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        for (int score : scores) {
            sum += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }
        int average = (int) sum / n;
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
