public class MathOperations {
    public static void main(String[] args) {
        int a = 9, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        int x = 5;
        System.out.println("Unary Operators:");
        System.out.println("Original x: " + x);
        System.out.println("Post-increment: " + (x++)); 
        System.out.println("After post-increment : " + x);
        System.out.println("Pre-increment: " + (++x)); 
        int y = 10;
        System.out.println("Assignment Operators:");
        y += 5; 
        System.out.println("y += 5: " + y);
        y *= 2;
        System.out.println("y *= 2: " + y);
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println("Logical Operators:");
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("Max of a and b: " + max);
    }
}