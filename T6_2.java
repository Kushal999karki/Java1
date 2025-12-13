
/**
 * Write a description of class T6_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class T6_2
{
    public static void main(String [] args)
    {
        int[][] matrix= {  {1,2,3}, {4,5,6}, {7,8,9} };
        
        System.out.println(matrix[0][1]);// Single 
        
        for(int i=0; i< matrix.length; i++)
        {
            for(int j=0; j< matrix[i].length;j++)
            {
            System.out.println(matrix[i][j]);
            }
        }
    }
}