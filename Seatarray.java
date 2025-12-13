    
public class Seatarray
{
    public static void main(String [] args)
    {
        String seats[][] = new String[2][3];
        seats[0][0]= "Hari";
        seats[0][1]="Ram";
        seats[0][2]="Shyam";
        for (int row = 0; row < seats.length; row++) {
            for (int column = 0; column < seats[row].length; column++) {
                if (seats[row][column] == null) {
                    System.out.print("[empty]");
                } else {
                    System.out.print(seats[row][column] + " ");
                }
            }
            System.out.println();
    }
}
}