
import java.util.Scanner;

public class Attendance1

{

	public static String[][] Student=new String[11][10];
	Scanner scan=new Scanner(System.in);

	public void name_list()
	{

		Ini_Atte();

		Student[0][1]="01";
		Student[0][2]="02";
		Student[0][3]="03";
		Student[0][4]="04";
		Student[0][5]="05";
		Student[0][6]="06";
		Student[0][7]="07";
		Student[0][8]="08";
		Student[0][9]="09";

		System.out.println("\n\t\t-------    Attendance Report-(Jan-2020)   -------\n");

		for(int i=0;i<Student[0].length;i++)
		{
			System.out.print(Student[0][i]+"  ");
		}

		Student[0][0]="";
		Student[1][0]="John";
		Student[2][0]="David";
		Student[3][0]="Miller";
		Student[4][0]="Shajee";
		Student[5][0]="Kavin";
		Student[6][0]="Sujee";
		Student[7][0]="Kandee";
		Student[8][0]="Nishanth";
		Student[9][0]="Pirashanth";
		Student[10][0]="Anojan";

		for(int i=0;i<Student.length;i++)
		{
			System.out.println(Student[i][0]);
		}
	}

	public void Ini_Atte()
	{
		for(int i=1;i<Student.length;i++)
		{
			for(int j=1;j<Student[0].length;j++)
			{
				Student[i][j]=" ";
			}
		}
	}


	public void Final_Atte()
	{
		for(int i=0;i<Student.length;i++)
		{
			for(int j=0;j<Student[0].length;j++)
			{
				System.out.print("    "+Student[i][j]+"   ");
			}
			System.out.println("\n");
		}
	}



	public void User_Input()
	{
		String date;
		System.out.print("\nEnter the Date : ");
		date=scan.next();

		for(int i=1;i<Student[0].length;i++)
		{
			if(Student[0][i].equals(date))
			{

				if (Student[i][i].equals(" "))
				{

					System.out.println("\n--------Info Present (1) Or Absent(0)--------\n");
					for(int j=1;j<(Student[0].length+1);j++)
					{
						String atte;
						System.out.print(Student[j][0]+" : ");
						atte=scan.next();
						Student[j][i]=atte;
					}
					Final_Atte();
					User_Input();
					return;
				}
				else
				{
					System.out.println("Date Is Already Exist !!");
					User_Input();
					return;
				}
			}

			else
			{


			}

		}

		System.out.println("\nInvalid Date !!");
		User_Input();
	}



	public static void main(String args[])
	{

	Attendance1 user=new Attendance1();
	user.name_list();
	user.User_Input();

	}

}





