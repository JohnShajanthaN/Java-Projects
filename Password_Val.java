import java.util.Scanner;
import java.lang.*;

public class Password_Validation

{


private static Scanner scan=new Scanner(System.in);

static String input;

static String[] split_input;

static String output;

static int input_len;

static int upper_cas=0;

static int lower_cas=0;

static int number_cou=0;

static int symbol_cou=0;

static String cap_let="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

static String sma_let="abcdefghijklmnopqrstuvwxyz";

static String num="0123456789";

static String sym="!@#$-?";


public static void space_chk()
{
    System.out.print("Enter The Text : ");
     
      input=scan.nextLine();
      
      System.out.println(input);
    
    if(input.contains(" "))
    {
        
        System.out.println("\nPassword Cannot Be Contains White Spaces");
    
    }
    
    else
    {
        
        length_chk();
        
    }
}


public static void length_chk()
{

input_len=input.length();

   if(input_len==0)
   {
       System.out.print("\nPassword Cannot Be Blank !!");
       
   }

   else if(input_len>7 && input_len<16)
   {
       
       content_chk();
       upp_cas_chk();
   }
   
   else if (input_len<8)
   {
   
   System.out.print("\nPassword Length Should Be Above 8 Char");
   
   }
   
   
   else if (input_len>15 )
   {
   
   System.out.print("\nPassword Length Should Be Less Than 15 Char");
   
   }
   
   
}


public static void content_chk()

{
    
    int size=input.length();
    
    split_input=input.split("");
    
 for(int j=0;j<split_input.length;j++)
    
    {
        
        if(cap_let.contains(split_input[j]))
        
    {
        
        upper_cas++;
    }
    
    else if (sma_let.contains(split_input[j]))
     
    {
        
        lower_cas++;
        
    }
    
     else if (num.contains(split_input[j]))
     
    {
        
        number_cou++;
        
    }
    
     else if (sym.contains(split_input[j]))
     
    {
        
        symbol_cou++;
        
    }
    
    else
    
    {
        
        System.out.println("\nInvalid Input Character !!");
        
    }
        
    }
    
   
}


public static void upp_cas_chk()
{
    if(upper_cas>0)
    
    {
        low_cas_chk();
    }
    
    else
    
    {
        
        System.out.println("\nPassword Must Be Contains At Least 1 Capital Letter !!");
    
    }
    
}



public static void low_cas_chk()
{
    
      if(lower_cas>0)
    
    {
        num_cou_chk();
    }
    
    else
    
    {
        
        System.out.println("\nInvalid Password Format !!");
    
    }
}


public static void num_cou_chk()
{
      if(number_cou>0)
    
    {
        sym_cou_chk();
    }
    
    else
    
    {
        
        System.out.println("\nPassword Must Be Contains At Least 1 Number !!");

        
    }
    
}


public static void sym_cou_chk()
{
      if(symbol_cou>0)
    
    {
        pass_str_chk();
    }
    
    else
    
    {
        
        System.out.println("\nPassword Must Be Contains At Least 1 Special Character !!");
    
        
    }
    
}


public static void pass_str_chk()

{
    
    if((upper_cas==1 && lower_cas>4 && symbol_cou==1 && number_cou==1))
    
    {
      
      System.out.println("\nPassword Strength - Weak");
        
    }
    
    else if((upper_cas==2 && lower_cas>1 && symbol_cou==2 && number_cou==2))
    
    {
      
      System.out.println("\nPassword Strength - Medium");
        
    }
    
    else if((upper_cas>2 && lower_cas>2 && symbol_cou>2 && number_cou>2))
    
    {
      
      System.out.println("\nPassword Strength - High");
        
    }
    
    else
    {
        
    }
    
}


    public static void main(String[] args)
     {
     
      space_chk();
      
    }
    
}