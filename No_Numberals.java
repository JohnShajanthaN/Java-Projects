import java.util.Scanner;
import java.lang.*;
import java.util.HashMap;
import java.io.*;

public class No_Numberals

{


private static Scanner scan=new Scanner(System.in);

static String input;

static String output;

static String[] split_input;

static StringBuffer sb=new StringBuffer("");

static HashMap<String,String> number=new HashMap<>();



private static void user_input()
{

      System.out.print("Enter the Text : ");
      input=scan.nextLine();
      String a=input.trim();
      System.out.println(a);
      split_input=input.split("");
      
      
number.put("0","zero");
number.put("1","one");
number.put("2","two");
number.put("3","three");
number.put("4","four");
number.put("5","five");
number.put("6","six");
number.put("7","seven");
number.put("8","eight");
number.put("9","nine");
      
     for(int i=0;i<split_input.length;i++)
     {
      if(number.keySet().contains(split_input[i]))    
      {
      
       String reletter=number.get(split_input[i]);
       split_input[i]=reletter.toLowerCase();
       
      }
      
      else
      {
          split_input[i]=split_input[i];
          
      }
      
    }
      
    System.out.print("\nEncrypted Message : ");
      
    String c="";
    
    for(int i=0;i<split_input.length;i++)
     {
      
     sb.append(split_input[i]);
    
     }
     
     output=sb.toString().trim();
     
     output.replaceAll("\\s+"," ");
   
     
     System.out.println(output);
     
     
    
}


    public static void main(String[] args)
     {
     
      user_input();
      
      
    }
}