import java.util.Scanner;
import java.lang.*;
import java.io.*;


public class Secret_Message

{


private static Scanner scan=new Scanner(System.in);
static String input;
static StringBuffer sb=new StringBuffer("");
static String output;
static String alpha1="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
static int alpha1_size=alpha1.length();
static String[] split_char;




private static void user_input()
{

      System.out.print("Original Message : ");
      input=scan.nextLine();
      String a=input.trim();
      System.out.println(a);
      split_char=input.split("");
      
     for(int i=0;i<split_char.length;i++)
     {
    
      
      if(alpha1.contains(split_char[i]))
      {
      
       int pos=alpha1.indexOf(split_char[i]);
       int repos=alpha1_size-pos-1;
       char reletter=alpha1.charAt(repos);
       split_char[i]=Character.toString(reletter).toLowerCase();
      }
      
      else
      {
          split_char[i]=" ";
          
      }
      
    }
      
    System.out.print("\nEncrypted Message : ");
      
    for(int i=0;i<split_char.length;i++)
     {
     
       sb.append(split_char[i]);
    
     }
    
     output=sb.toString();
     
     System.out.println(output.trim());

}


    public static void main(String[] args)
     {
     
      user_input();
      
      
    }
}