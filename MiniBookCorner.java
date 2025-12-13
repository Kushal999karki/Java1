
public class MiniBookCorner
{
   public static void main(String [] args)
   {
        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "The Great Gatsby";
        prices[0][0] = 550.00;

        titles[1][0] = "Asahamati - 5";
        prices[1][0] = 750.00;

        for (int i = 0; i < categories.length; i++) {
            for (int j = 0; j < titles[i].length; j++) {
                System.out.printf("Category: " + categories[i] + " / Title: " + titles[i][j] + " / Price: " + prices[i][j]);
            }
            System.out.println();
        }
    }
}