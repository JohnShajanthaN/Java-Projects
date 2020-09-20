import java.util.Scanner;
public class Star_World
{
    public static void main(String[] args) 
    {
    
    Scanner scan=new Scanner(System.in);
    
    int r;
    
    System.out.println("No Of Rows :");

      r=scan.nextInt();
      
      System.out.print("\n");
      
      String s=" ";
        
        
        for(int k=0;k<r;k++)
        {
        
            for(int i=1;i<7;i++)
            {
        
         System.out.print(s.repeat(7-i));
            for(int j=i;j>0;j--)
            {
              System.out.print("* ");
            }
            System.out.print("\n");
        }

        }
        
        for(int i=0;i<5;i++)
        {
            System.out.println("     * *  ");
        }
        
    }
}