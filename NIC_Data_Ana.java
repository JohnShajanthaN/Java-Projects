import java.util.Scanner;

public class NIC_Analyser
{


static Scanner scan=new Scanner(System.in);

static String nic;

static int year;

static int month;

static int date;

static int gen;

static int age;

static String vote="Yes";

static String gender;

static String weekday;

static int weekday_code;

static int year_code;

static int month_code;

static int cen_code;

static int date_code;

static int leaf_year_code;

static int nic_len;

static String new_nic;

static String num="0123456789";

static String[] split_nic;

static int[] month_list={0,3,3,6,1,4,6,2,5,0,3,5};

static String[] weekday_list={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

   static void Get_Nic()
    {
    
        System.out.print("Enter The NIC Number : ");
        
       nic=scan.nextLine();
       
       System.out.println("\n");
       
       nic_len=nic.length();
       
       len_chk();
        
    }
    
    
    
    static void len_chk()
    {
        
        if(nic_len==10 || nic_len==12)
        
        {
            if(nic_len==10)
            
            {
        
             num_chk1();
             
            }
            
            else
            
            {
            
            num_chk2();
            
            }
            
            
        }
        
        else
        
        {
            
        System.out.println("\nInvalid NIC Number!!Length Of NIC Number Should Be 10 If NIC Number In Old Format or 12 If NIC Number In New Format");

        }
        
    }
    

static void num_chk1()

{
     split_nic=nic.split("");
            
   for(int i=0;i<(split_nic.length-1);i++)
   
   {
   
     if(num.contains(split_nic[i]))
     {
         
     }
     
     else
     {
         System.out.println("\nNIC Doesn't Contains Any Special Char or Letter !!'");
         return;
        
     }
    
   }
   
   char_chk1();
    
}


static void num_chk2()

{
     split_nic=nic.split("");
            
   for(int i=0;i<split_nic.length;i++)
   
   {
   
     if(num.contains(split_nic[i]))
     {
         
     }
     
     else
     {
         System.out.println("\nNIC Doesn't Contains Any Special Char or Letter !!'");
         return;
        
     }
    
   }
   
  Gen_Chk1();
    
}


static void char_chk1()

{
 if(split_nic[9].equals("v") || split_nic[9].equals("x") )

   
   {

     vote_eli();
     Gen_Chk();
       
   }
   
   else
   
   {
       
       System.out.println("\nLast Digit Of NIC Number Should Be V or X");
   }

}

static void vote_eli()

{

   if(split_nic[9].equals("v"))
   
   {
       vote="Yes";
   }
   
   else if (split_nic[9].equals("x"))
   
   {
       vote="No";
   }

}


static void Gen_Chk()

{
  
    String con_str=split_nic[2]+split_nic[3]+split_nic[4];
    
  gen=Integer.parseInt(con_str);
   
   if(gen<1)
   {
       
       System.out.println("Invalid NIC Number!!"+"\n"+"\n"+"The Value From 3rd Digit To 5th Digit Cannot Be Zero");
   }
   
   else if(gen<367)
   {
    
    gender="Male";
    year_cal();
       
   }
   
   else if(gen<501)
   {
    
    System.out.println("Invalid NIC Number!!"+"\n"+"\n"+"The Value From 3rd Digit To 5th Digit Cannot Be Between 366 & 500");
       
   }
   
   else if(gen<867)
   {
    
   gender="Female";
   gen=gen-500;
   year_cal();
       
   }
   
   else
   {
       System.out.println("Invalid NIC Number!!"+"\n"+"\n"+"The Value From 3rd Digit To 5th Digit Cannot Be Between 866 & 999");
   }
 
   
   
}



static void Gen_Chk1()

{
  
    String con_str=split_nic[4]+split_nic[5]+split_nic[6];
    
  gen=Integer.parseInt(con_str);
   
   if(gen<1)
   {
       
       System.out.println("Invalid NIC Number!!"+"\n"+"\n"+"The Value From 3rd Digit To 5th Digit Cannot Be Zero");
   }
   
   else if(gen<367)
   {
    
    gender="Male";
    year_cal1();
       
   }
   
   else if(gen<501)
   {
    
    System.out.println("Invalid NIC Number!!"+"\n"+"\n"+"The Value From 3rd Digit To 5th Digit Cannot Be Between 366 & 500");
       
   }
   
   else if(gen<867)
   {
    
   gender="Female";
   gen=gen-500;
   year_cal1();
       
   }
   
   else
   {
       System.out.println("Invalid NIC Number!!"+"\n"+"\n"+"The Value From 3rd Digit To 5th Digit Cannot Be Between 866 & 999");
   }
 

   
}


   
    static void year_cal()
    
    {
        
        String con_year=split_nic[0]+split_nic[1];
        
        year=1900+Integer.parseInt(con_year);
        
   
    new_nic_cal();
    month_cal();
    
   
        
    }
    
    static void new_nic_cal()
    
    {
        
        new_nic=Integer.toString(year)+Integer.toString(gen)+"0"+split_nic[5]+split_nic[6]+split_nic[7]+split_nic[8];
        
    }
    
    
      static void year_cal1()
    
    {
        
        String con_year=split_nic[0]+split_nic[1]+split_nic[2]+split_nic[3];
        
        year=Integer.parseInt(con_year);
        
   
    month_cal();
   
        
    }
    
    
    static void month_cal()
    
    {
  
     if(gen<32)
     {
         month=1;
         date=gen;
     }
     
     else if(gen<61)
     {
         month=2;
         date=gen-31;
     }
     
     else if(gen<92)
     {
         month=3;
         date=gen-60;
     }
     
     else if(gen<122)
     {
         month=4;
         date=gen-91;
     }
     
     
     else if(gen<153)
     {
         month=5;
         date=gen-121;
     }
     
     
     else if(gen<183)
     {
         month=6;
         date=gen-152;
     }
     
     
     else if(gen<214)
     {
         month=7;
         date=gen-182;
     }
     
     
     else if(gen<245)
     {
         month=8;
         date=gen-213;
     }
     
     
     else if(gen<275)
     {
         month=9;
         date=gen-244;
     }
     
     
     else if(gen<306)
     {
         month=10;
         date=gen-274;

     }
        
  
     else if(gen<336)
     {
         month=11;
         date=gen-305;
     }
        
    
     else if(gen<367)
     {
         month=12;
         date=gen-335;
     }
        
     else
     {
         
         
     }
     
     year_code_cal();
     
    }
    
    
    static void year_code_cal()
    {
    
      int a=(year%100);
      
      int b=(a/4);
      
      int c=a+b;
      
      year_code=c%7;
      
      month_code_cal();
        
    }
    
    
    static void month_code_cal()
    
    {
        
     month_code=month_list[month-1];
     cen_cal();
     
    }
    
    static void cen_cal()
    
    {
        if(year/100==17)
        {
            cen_code=4;
        }
        
        else if(year/100==18)
        {
            cen_code=2;
        }
        
        else if(year/100==19)
        {
            cen_code=0;
        }
        
        else if(year/100==20)
        {
            cen_code=6;
        }
        
        else if(year/100==21)
        {
            cen_code=4;
        }
        
        else if(year/100==22)
        {
            cen_code=2;
        }
        
        else if(year/100==23)
        {
            cen_code=0;
        }
        
        else
        {
            
        }
        
        date_cal();
        
    }
    
    
    static void date_cal()
    
    {
        
        date_code=date;
        
        leaf_year_cal();
        
    }
    
    
    static void leaf_year_cal ()
    
    {
        
        if(year%100==0)
        
        {
            
          if(year%400==0)
            {
            
            if(month==1 || month==2)
            {
                leaf_year_code=1;
            }
            
            else
            {
                
                leaf_year_code=0;
                
            }
            
            }
            
          else
            {
                
                leaf_year_code=0;
            }
        }
        
        else
        {
           if(year%4==0)
           {
               
              if(month==1 || month==2)
            {
                leaf_year_code=1;
            }
            
            else
            {
                
                leaf_year_code=0;
                
            } 
               
           }
           
           else
           {
               
               leaf_year_code=0;
               
           }
            
        }
        
        final_cal();
    }
    
    
    static void final_cal()
    
    {
       weekday_code=(year_code+month_code+date_code+cen_code-leaf_year_code)%7;
       
       weekday=weekday_list[weekday_code];
    
       age_cal();
    }
    
    
    static void age_cal()
    
    {
        
        age=2020-year;
        
        if(nic_len==10)
        {
            print_nic_old();
        }
        else
        {
            print_nic_new();
        }
        
    }
    
    
    static void print_nic_new()
    {
        
        
        System.out.println("NIC Number : "+nic+"\n");
        
        System.out.println("DOB : "+year+"-"+month+"-"+date+"\n");
        
        System.out.println("Weekday : "+weekday+"\n");
        
        System.out.println("Gender : "+gender+"\n");
        
        System.out.println("Age : "+age+"\n");
        
        System.out.println("Vote Eligibility: "+vote+"\n");
    
    }
    
     static void print_nic_old()
    {
        
        
        System.out.println("NIC Number : "+nic+"\n");
        
        System.out.println("New NIC Format : "+new_nic+"\n");
        
        System.out.println("DOB : "+year+"-"+month+"-"+date+"\n");
        
        System.out.println("Weekday : "+weekday+"\n");
        
        System.out.println("Gender : "+gender+"\n");
        
        System.out.println("Age : "+age+"\n");
        
        System.out.println("Vote Eligibility: "+vote+"\n");
    
    }
    

    public static void main(String[] args)
    {
    
    Get_Nic();
        
    }
}