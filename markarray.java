public class markarray {
    public static void main(String[] args) {
        int[][] marks = new int[2][2];
        marks[0][0] = 80;  
        marks[0][1] = 75;  
        marks[1][0] = 90;  
        marks[1][1] = 85;  
        System.out.println("Marks Table:");
        System.out.println("Student\t\tNepali\t\tEnglish");
        
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + "\t\t");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("Total Marks for Each Student:");
        
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println("Student " + (i + 1) + " Total: " + total);
        } 
    }
}