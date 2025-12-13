import java.util.Scanner;
public class arstudent
{
  public static void main(String [] args)
  {
      Scanner sc = new Scanner(System.in);
      String [] name={"Kushal","Lalit","Leon","Mukul","Nashib"};
      for(int i=0; i< name.length;i++)
        {
            System.out.println(name[i]);
        }
        String indexName= name[2];
        System.out.println(indexName);
        name [4] = "Saroj";
        System.out.println(name[4]);
        
}
}