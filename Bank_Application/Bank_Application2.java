import java.util.Scanner;
import java.util.*;
import java.sql.Date;



class Bank_Application2
{
	Scanner scan=new Scanner(System.in);
	 int Lang;
	 int User_Opt;
	 String uname;
	 String pass;
	 int sessionid;
	 int pass_count=0;
	 int Num_Of_Dep=0;
	 double Tot_Amo_Dep=0;
	 int i;
	 int j;
	 int index;
	 float withdrawal_amount1;
	 float deposit_amount1;
	

		Bank_Application2()
		
		{
			//Home_Page();
		}
	
	
		String[] Username=new String[]{"Admin@John","Kavirajan","Johndavid","Sujitharan","Shajeepan"};
		
	    int[] User_ID=new int[]{0,1,2,3,4};
		
		String[] Account_Type=new String[]{"Current","Saving","Current","Current","Saving"};
		
		int[] Account_No=new int[] {1501234567,1501234567,1501234568,1501234569,1501234570};
		
		double[] Account_Balance=new double[]{0.00,12500.00,225000.00,75000.00,155000.00};
		
		String[] Password=new String[]{"P@$$w0rD","Kavin1995","Abcd@1234","Suji_Digit","Shajee321"};
		
		String[] Status=new String[]{"Active","Active","Block","Deactive","Active"};
		
		
	 void Home_Page()
	{
	
	withdrawal_amount1=0;
	deposit_amount1=0;
    System.out.println("***************************************************************");
	System.out.println("*                                                             *");
	System.out.println("*                                                             *");
	System.out.println("*                Welcome To John Online Banking               *");
	System.out.println("*                ------------------------------               *");
	System.out.println("*                                                             *");
	System.out.println("*                  Choose Your Prefer Language                *");
	System.out.println("*                                                             *");
	System.out.println("*            1> English     2> Tamil     3>Singala            *");
	System.out.println("*                                                             *");
	System.out.print("* Prefer Language Choice : ");
	Lang=scan.nextInt();
	System.out.println("*                                                             *");
	switch(Lang)
	{
	case 1:
	user_option();
	break;

	case 2:
	user_option();
	break;
	
	case 3:
	user_option();
	break;
	
	default:
	System.out.println("Enter the Valid Choice Like 1 || 2 || 3");			
	}
	}
	
	
	void user_option()
	{
	
	System.out.println("***************************************************************");
	System.out.println("*                                                             *");
	System.out.println("*                                                             *");
	System.out.println("*                Welcome To John Online Banking               *");
	System.out.println("*                ------------------------------               *");
	System.out.println("*                                                             *");
	System.out.println("*                                                             *");
	System.out.println("*                    1> Signin     2> Signup                  *");
	System.out.println("*                                                             *");
	System.out.println("*                                                             *");
	System.out.print("* Choose Your Option : ");
	User_Opt=scan.nextInt();
	System.out.println("*                                                             *");
	switch(User_Opt)
	{
	case 1:
	BUsername();
	break;

	case 2:
	User_Signup();
	break;
	
	default:
	System.out.println("Enter the Valid Choice Like 1 || 2");			
	}
	}
		

	
	 	
	void BUsername()
	{

		System.out.println("*                                                             *");
		System.out.println("*                      User_Login_Panel                       *");
		System.out.println("*                      ----------------                       *");
		System.out.println("*                                                             *");
		System.out.print("*        Username : ");
		uname=scan.next();
		pass_count=0;
		
		for (int i=0;i<Username.length;i++)
		 {
			
			 if(uname.equals("Admin@John"))
			 {
				 sessionid=i;
				 BPassword();
				 return;
			 }
			 
			 else if(Username[i].equals(uname))
			 {
				 if(Status[i].equals("Active"))
				 {
					sessionid=i;
					BPassword();
		
				 return;
				 }
				 
				 else if(Status[i].equals("Deactive"))
				 {
					sessionid=i;
					System.out.println("*                                                             *");
					System.out.println("* "+"Your "+Account_Type[sessionid]+" Account has been Deactivated due to non usage as last 6 months !! *\n");
					System.out.println("* Visit your nearest branch to Activate your "+Account_Type[sessionid]+" Account || Call to 1234 for further details *\n\n");
					Home_Page();
					return;
				 }
				 
				 else if(Status[i].equals("Block"))
				 {
					sessionid=i;
					System.out.println("*                                                             *");
					System.out.println("* "+"Your "+Account_Type[sessionid]+" Account has been Blocked due some unauthorized activites !! *\n");
					System.out.println("* Visit your nearest branch to Activate your "+Account_Type[sessionid]+" Account || Call us 1234 for further details *\n\n");
					Home_Page();
					return;
				 }	
				 
				 else
				 {
					 
				 }
			 }
				 
			 else
				 {
						
				 }
		 }
			 
		System.out.println("*\n Invalid Username!!                                          *\n");
		BUsername();
	}
	
	
	void BPassword()
	{
		//int index=findIndex(Username,uname);
		System.out.println("*                                                             *");
		System.out.print("*        Password : ");
		pass=scan.next();
		++pass_count;

		if(pass_count<4)
		{
	
		for (int j=0;j<Password.length;j++)
			{
			
					if(pass.equals("P@$$w0rD"))
					{
						sessionid=j;
						Customer_Details();
						return;
					}
					else
					{
						if(Password[j].equals(pass))
						{
							sessionid=j;
							System.out.println("*                                                             *");
							System.out.println("*  Successfully Login !!                                      *");
							User_Dashboard();
							choice();
							return;
						}
						else
						{
						
						}
					}
			}
			
			if(pass_count==1)
			{
			System.out.println("*                                                             *");
			System.out.println("*        Attempt 2 : "+"                                        *");
			System.out.println("*        ---------                                             *");
			BPassword();
			}
			else if(pass_count==2)
			{
			System.out.println("*                                                             *");
			System.out.println("*        Last Attempt : "+"                                    *");
			System.out.println("*       --------------                                        *");
			BPassword();
			}
			else if(pass_count==3)
			{
			System.out.println("*                                                             *");
			System.out.println("*        Password doesn't match with your username !!         *");
			System.out.println("*        Your "+Username[sessionid]+" Account Has Been Blocked !!             *\n");
			Status[sessionid]="Block";
			Home_Page();
			}
			else
			{
				
			}
		}
		else
		{
			System.out.println("*                                                             *");
			System.out.println("*        Password doesn't match with your username !!         *");
			System.out.println("*        Your "+Username[sessionid]+" Account Has Been Blocked !!             *\n");
			Status[sessionid]="Block";
			Home_Page();
		}	
	}

	
	
	void User_Dashboard()
	{
		
	System.out.println("*                                                             *");
	System.out.println("***************************************************************");
	System.out.println("*                                                             *");
	System.out.println("*                                                             *");
	System.out.println("*           Hi "+"!"+uname+"!"+"  Welcome to Online Banking          *");
	System.out.println("*                                                             *");
	System.out.println("*                                                             *");
	System.out.println("***************************************************************");
	System.out.println("*                                                             *");
	System.out.println("*                                                             *");  
	System.out.println("*     User_ID "+"  Account_No "+"  Account_Type "+"  Account_Balance   *");
	System.out.println("*    ---------"+"  ---------- "+"  -----------  "+"  ---------------   *");  
	System.out.println("*                                                             *"); 
	System.out.println("*        "+User_ID[sessionid]+"      "+Account_No[sessionid]+"     "+Account_Type[sessionid]+"         "+Account_Balance[sessionid]+"\n");
	choice();
	}
	
	void choice()
	{
		System.out.println("***************************************************************");
		System.out.println("*                     Choose your option                      *");
		System.out.println("*                     ------------------                      *");
		System.out.println("*         1> Withdrawal                 2> Deposit            *");
		System.out.println("*         3> Balance_Check              4> Exit               *");
		System.out.println("*         5> Smart Passbook                                   *"+"\n");
		System.out.print("\n          Choose Your Option : ");
		int dw;
		dw=scan.nextInt();
		if(dw==1)
		{
			Withdrawal();
		}
		else if(dw==2)
		{
			Deposit();
		}
		else if(dw==3)
		{
			Account_Bal();
		}
		else if(dw==4)
		{
			System.out.println("***************************************************************");
			System.out.println("*         Account_No   "+"   Account_Type   "+"   Account_Balance   *");
			System.out.println("*         ----------   "+"   ------------   "+"   ---------------   *");
			System.out.println("*         "+Account_No[sessionid]+"          "+Account_Type[sessionid]+"             "+Account_Balance[sessionid]+"      *"+"\n");
			System.out.println("*----------       ** Thank You Come Again **        ----------*"+"\n");

			Home_Page();
			//System.exit(0);
		}
		else if(dw==5)
		{
			User_Transctation_Head();
			User_Transctation();
		}
		else
		{
		System.out.println("Enter the correct char Like D or W !!");
		choice();
		}
		
	}
	
	
	void block_choice()
	{
		System.out.println("***************************************************************");
		System.out.println("*                     Choose your option                      *");
		System.out.println("*                     ------------------                      *");
		System.out.println("*         1> Withdrawal                 2> Deposit            *");
		System.out.println("*         3> Balance_Check              4> Exit               *"+"\n");
		System.out.print("\n          Choose Your Option : ");
		int bdw;
		bdw=scan.nextInt();
		if(bdw==1)
		{
			System.out.println("*                                                         *");
			System.out.println("*    You dont have authorized to access these features    *");
			block_choice();
		}
		else if(bdw==2)
		{
			System.out.println("*                                                         *");
			System.out.println("*    You dont have authorized to access these features    *");
			block_choice();
		}
		else if(bdw==3)
		{
			System.out.println("*                                                         *");
			System.out.println("*    You dont have authorized to access these features    *");
			block_choice();
		}
		else if(bdw==4)
		{
			System.exit(0);
		}
		else
		{
		System.out.println("Enter the correct char Like D or W !!");
		choice();
		}
		
	}
	
	
	 void Withdrawal()
	{

		System.out.print("\nEnter the amount to withdrawal : ");
		float withdrawal_amount;
		withdrawal_amount=scan.nextFloat();
		if((Account_Balance[sessionid]-1500.00)>=withdrawal_amount)
		{
			Account_Balance[sessionid]=Account_Balance[sessionid]-withdrawal_amount;
			System.out.println("\nPlease await a moment.Processing !!!\n");
			System.out.println("***************************************************************");
			choice();
			withdrawal_amount1=withdrawal_amount;
			User_Transctation();
		}
		else
		{
			System.out.println("\nInsufficient Account Balance !!\n");
			choice();
		}
	}
	
	void Deposit()
	{
		
		System.out.print("\nEnter the amount to deposits : ");
		float deposit_amount;
		deposit_amount=scan.nextFloat();
		
	 
		if(deposit_amount<0)
		{
				System.out.println("\nAmount Cannot Be Negative.Enter the Valid Amount !!\n");
				Deposit();
		}
		else if(deposit_amount==0)
		{
				System.out.println("\nAmount Cannot Be Zero.Enter the Valid Amount !!\n");
				Deposit();
		}
		
		else if(deposit_amount<500)
		{
				System.out.println("\nAmount Must be Above Rs 500.00.Enter the Valid Amount !!\n");
				Deposit();
		}
		else if(deposit_amount<=100000)
		{
			
			if(Num_Of_Dep<10 && Tot_Amo_Dep<=100000 && deposit_amount<=(100000-Tot_Amo_Dep))
			{
				++Num_Of_Dep;
				Tot_Amo_Dep=Tot_Amo_Dep+deposit_amount;
				//System.out.println(Num_Of_Dep);
				//System.out.println(Tot_Amo_Dep);
				Account_Balance[sessionid]=Account_Balance[sessionid]+deposit_amount;
				choice();
				deposit_amount1=deposit_amount;
				User_Transctation();
				return;
			}
			
			else
			{
				if(Num_Of_Dep>10)
				{
						System.out.println("\nYou have exceed Maximum number of Deposits per Day !!\n"); //Need to Disable the Deposit Option 
						choice();
						return;
				}
				
				else if(Tot_Amo_Dep>100000)
				{
					
					System.out.println("\nYou have exceed Maximum Amount for Deposits per Day !!\n"); //Need to Disable the Deposit Option 
					choice();
					return;
				}
				
				else
				{
					System.out.println("\nYou have exceed Maximum Amount for Deposits per Day !!\n"); //Need to Disable the Deposit Option 
					choice();
					return;
					
				}
			}
		}
		
		else
		{
			System.out.println("\nAmount has been Exceed Above Rs 100,000.000.Enter the Valid Amount !!\n");
			Deposit();
		}
	}
	
	
	void Customer_Details()
	{
		
		System.out.println("\n"+"UserID\t\t"+"Username\t"+"Password\t"+"Account_No\t"+"Account_Type\t"+"Account_Balance\t"+"   Status\t");
		System.out.println("------\t\t--------\t--------\t----------\t------------\t---------------\t  --------\t");
		
		for (int i=0;i<Username.length;i++)
			{
			System.out.println("  "+User_ID[i]+"\t\t"+Username[i]+"\t"+Password[i]+"\t"+Account_No[i]+"\t"+Account_Type[i]+"\t\t"+Account_Balance[i]+"\t\t  "+Status[i]+"\n");		
			}
		Home_Page(); 
	}	
	
	
	
	
	void User_Transctation_Head()
	{
		
		System.out.println("\n"+"\tTra_Date\t"+"Description\t"+"Amount(Dr/Cr)\t"+"Balance\t");
		System.out.println("\t--------\t-----------\t--------\t---------");
		
	}
		
		

		
		
	void User_Transctation()
	{
		
		//withdrawal_amount1=0;
		// deposit_amount1=0;
		// String Tra_Date=java.time.LocalDate.now();
		// Date date=Date.valueOf(Tra_Date);
		
		String Des="";
		
		float Tra_Amo=0;
		
		
		if(withdrawal_amount1>0)
		{
			Des="Withdrawal";
			Tra_Amo=withdrawal_amount1;
			Account_Balance[sessionid]=Account_Balance[sessionid]-Tra_Amo;
		}
		
		
		else if(deposit_amount1>0)
		{
			Des="Deposit";
			Tra_Amo=deposit_amount1;
			Account_Balance[sessionid]=Account_Balance[sessionid]+Tra_Amo;
		}
		
		
		
		System.out.println("\t"+"\t"+"\t"+Des+"\t"+"\t"+Tra_Amo+"\t"+"\t"+Account_Balance[sessionid]+"\t"+"\n");
		Tra_Amo=0;
		withdrawal_amount1=0;
		deposit_amount1=0;
		Des="";
		//choice();
		//Account_Balance[sessionid]=Account_Balance[sessionid]+Tra_Amo;
		
	}	
	
	
	
	
	
	
	void Account_Bal()
	{
		System.out.println("\nNew Account Balance Is :"+Account_Balance[sessionid]+"\n");	
		choice(); 
	}


	void User_Signup()
	{
	System.out.println("*                                                             *");
	System.out.println("***************************************************************");
	System.out.println("*                                                             *");
	System.out.println("*                                                             *");
	System.out.println("*                   Welcome to User Signup                    *");
	System.out.println("*                  ------------------------                   *");
	System.out.println("*                                                             *");	
	int id=User_ID[User_ID.length-1]+1;
	User_ID= Arrays.copyOf(User_ID,User_ID.length+1);
	User_ID[User_ID.length-1]=id;
	System.out.println("*  User ID : "+id);
	System.out.println("*                                                             *");	
	User_Name_Val();
	}

	
	
	void User_Name_Val()
	{
		String User_Name;
		System.out.print("*  Username : ");
		User_Name=scan.next();
		System.out.println("*                                                             *");
		int count=Username.length;
		
		for(int i=0;i<count;i++)
		{
			
		if(Username[i].equals(User_Name))
		{
		  System.out.println("Username Is already Exist.Try another Username !!\n");
		  System.out.println("*                                                             *");
		  User_Name_Val();
		  return;
		}
		else
		{
			
		}
		
		}
		Username= Arrays.copyOf(Username,count+1);
		Username[count]=User_Name;
		User_Pass_val();
	}
	
	
	void User_Pass_val()
	{
		String User_Pass;
		System.out.print("*  Password : ");
		User_Pass=scan.next();
		System.out.println("*                                                             *");
		int count=Password.length;
		
		for(int i=0;i<count;i++)
		{
			
		if(Password[i].equals(User_Pass))
		{
		  System.out.println("Password doesn't valid !!\n");
		  System.out.println("*                                                             *");
		  User_Pass_val();
		  return;
		}
		else
		{
			
		}
		
		}
		Password= Arrays.copyOf(Password,count+1);
		Password[count]=User_Pass;
		User_Ret_Pass_Val();
	}
	
	
	void User_Ret_Pass_Val()
	{
		String User_Ret_Pass;
		System.out.print("*  Retype Password : ");
		User_Ret_Pass=scan.next();
		System.out.println("*                                                             *");
		int count=Password.length;
			
		if(Password[count-1].equals(User_Ret_Pass))
		{
		  System.out.println("*                                                             *");
		  User_Acct_Type_Val();
		  return;
		}
		else
		{
		  User_Ret_Pass_Val();
		}
		
	}
	
	
	void User_Acct_Type_Val()
	{
		System.out.println("* Account Type :  1>  Saving    2>  Current         *");
		System.out.println("*                                                             *");
		System.out.print("Choose your Account Type : ");
		int User_Acct_Type=scan.nextInt();
		System.out.println("*                                                             *");
		
		switch(User_Acct_Type)
		{
			
			case 1:
			Saving_Acct();
			break;
			
			case 2:
			Current_Acct();
			break;
			
			default:
			System.out.println("Invalid Input !!");
			User_Acct_Type_Val();
			return;
			
		}
	}
	
	
	void Saving_Acct()
	{
		int Acct_No=Account_No[Account_No.length-1]+1;
		Account_No= Arrays.copyOf(Account_No,Account_No.length+1);
		Account_No[Account_No.length-1]=Acct_No;
		
		Account_Type= Arrays.copyOf(Account_Type,Account_Type.length+1);
		Account_Type[Account_Type.length-1]="Saving";
		
		System.out.println("*                                                             *");
		System.out.println("* Account Type : Saving");
		System.out.println("*                                                             *");
		System.out.println("* Account No : "+Acct_No);
		System.out.println("*                                                             *");
		User_Ini_Dep();
	}
	
	
	
	void Current_Acct()
	{
		int Acct_No=Account_No[Account_No.length-1]+1;
		Account_No= Arrays.copyOf(Account_No,Account_No.length+1);
		Account_No[Account_No.length-1]=Acct_No;
		
		Account_Type= Arrays.copyOf(Account_Type,Account_Type.length+1);
		Account_Type[Account_Type.length-1]="Current";
		
		System.out.println("*                                                             *");
		System.out.println("* Account Type : Current");
		System.out.println("*                                                             *");
		System.out.println("* Account No : "+Acct_No);
		System.out.println("*                                                             *");
		User_Ini_Dep();
	}
	
	
	
	void User_Ini_Dep()
	{
		double Ini_Amo;
		System.out.println("*                                                             *");
		System.out.print("* Enter the Initial Deposit Amount : ");	
		Ini_Amo=scan.nextDouble();
		if(Ini_Amo<0)
		{
			System.out.println("*Amount Cannot be Negative !!*");
			User_Ini_Dep();
			return;
		}
		else if(Ini_Amo==0)
		{
			System.out.println("*Amount Cannot be Zero !!*");
			User_Ini_Dep();
			return;
		}
		else if(Ini_Amo<1500)
		{
			System.out.println("*Amount Cannot be less than Rs 1500.00 !!*");
			User_Ini_Dep();
			return;
		}
		else
		{
			User_Sta();
			Account_Balance= Arrays.copyOf(Account_Balance,Account_Balance.length+1);
			Account_Balance[Account_Balance.length-1]=Ini_Amo;
			System.out.println("*                                                             *");
			System.out.println("*          You have successfully created Account !!           *");
			System.out.println("*                                                             *");
			New_User_Acct();
		}
	}
	
	
	void User_Sta()
	{
		Status= Arrays.copyOf(Status,Status.length+1);
		Status[Status.length-1]="Active";
	}
	
	void New_User_Acct()
	{
		int i=User_ID.length-1;
		
		System.out.println("\n"+"UserID\t\t"+"Username\t"+"Password\t"+"Account_No\t"+"Account_Type\t"+"Account_Balance\t"+"   Status\t");
		System.out.println("------\t\t--------\t--------\t----------\t------------\t---------------\t  --------\t");
		System.out.println("  "+User_ID[i]+"\t\t"+Username[i]+"\t\t"+Password[i]+"\t\t"+Account_No[i]+"\t"+Account_Type[i]+"\t\t"+Account_Balance[i]+"\t\t  "+Status[i]+"\n");	
		BUsername();
	}
	
	
	public static void main(String args[])
	{
		Bank_Application2 user2=new Bank_Application2();
		user2.Home_Page();
	}
}