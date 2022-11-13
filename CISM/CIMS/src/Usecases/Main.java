package Usecases;

import java.util.Scanner;

public class Main {
	static boolean options = true;

	public static void menu()
	{   
		
        System.out.println("***************************************************************************");
		System.out.println("***************** ( CRIME INFORMATION MANAGEMENT SYSTEM ) *****************"
				+"\n***************************************************************************"
				
				+ "\n1.To Check and Add Crime Details" + "\n2.To Check and Add Criminal Details"
				+ "\n3.To Check and Add Criminals Crime Details" + "\n4.Exit");
		System.out.println();
		
		

	}

	static boolean Switch1 = true;

	public static void switchcase1()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			Switch1 = true;
			System.out.println("\n1.Add crime" + "\n2.View crime Record"
					+ "\n3.Update Crime Case Statuse resolve/Unresolve" + "\n4.No of resolve and unresolve crime"
					+ "\n5.Number of crimes recorded in the current month" + "\n6.Go Back");
			int Choice = sc.nextInt();
			switch (Choice)
			{

			case 1:
				System.out.println("Add Crime");
				AddCrimeUsecase.AddCrimeRecord();
				break;

			case 2:
				System.out.println("View crime Record");
				GetCrimeUsecase.ViewCrimeRecord();
				break;

			case 3:
				System.out.println("Update crime Case Status");
				StatusUpdateUsecase.UpdateCaseStatus();
				break;

			case 4:
				System.out.println("No of resolved and unresolved crime");
				GetCrimeStatusCountUsecase.countSovingCases();
				break;

			case 5:
				System.out.println("Number of crimes recorded in the current month");
				GetcurrentMonthcrimeUsecase.OneMonthCrime();
				break;

			case 6:
				System.out.println("***************** THANK YOU *****************");
				Switch1 = false;
				break;

			default:
				System.out.println("Please enter valid  Choice");
				break;
			}
		}
		while (Switch1);

	}
	static boolean Switch2 = true;

	public static void switchcase2()
	{

		Scanner sc = new Scanner(System.in);
		do
		{
			Switch2 = true;
			System.out.println("\n1.Add criminal" + "\n2.View criminal Record" + "\n3.Update Criminal Record"
					+ "\n4.View all criminal Record" + "\n5.Go Back");
			int Choice = sc.nextInt();
			switch (Choice)
			{

			case 1:
				System.out.println("Add Criminal");
				AddCriminalUseCase.Addcriminal();
				break;

			case 2:
				System.out.println("View criminal Record");
				GetCriminalByCidUsecase.ViewCriminalById();
				break;

			case 3:
				System.out.println("Update criminal record");
				UpdateCriminalUsecase.Updatecriminal();
				break;

			case 4:
				System.out.println("View all criminal Record ");
				GetCriminalsUsecase.Criminal();
				break;

			case 5:
				System.out.println("***************** THANK YOU *****************");

				Switch2 = false;
				break;

			default:
				System.out.println("Please enter valid  Choice");
				break;
			}
		}
		while (Switch2);

	}

	static boolean Switch3 = true;

	public static void switchcase3()
	{

		Scanner sc = new Scanner(System.in);
		do
		{
			Switch3 = true;
			System.out.println("\n1.Add Crime-wise criminal Record" + "\n2.View Crime-Wise criminal Record"
					+ "\n3.Delete criminal Record" + "\n4.Go Back");

			int Choice = sc.nextInt();
			switch (Choice)
			{

			case 1:
				System.out.println("Add Criminal wise-crime Record");
				AddCrime_Criminal_RecordUsecase.AddCriminalCrime();

				break;

			case 2:
				System.out.println("View Crime-Wise criminal Record");
				Getcrime_CriminalUsecase.CriminalCrimeRecord();
				break;

			case 3:
				System.out.println("Delete criminal Record");
				DeleteCrime_CriminalUseCase.DelectCrimeRecord();
				break;

			case 4:
				System.out.println(" ***************** THANK YOU ***************** ");
				Switch3 = false;
				break;
			default:
				System.out.println("Please enter valid  Choice");
				break;
			}
		}
		while (Switch3);
	}
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		do
		{
			menu();
			System.out.println("Select your Choice");
			int Choice = sc.nextInt();

			switch (Choice)
			{

			case 1:
				System.out.println("Check and add Crime detail");

				switchcase1();
				break;

			case 2:
				System.out.println("Check and add Criminal detail");
				switchcase2();
				break;
			case 3:
				System.out.println("Check and add Criminal Crime detail");
				switchcase3();
				break;

			case 4:
				System.out.println("***************** THANK YOU *****************");
				options = false;
				break;

			default:
				System.out.println("Please enter valid  Choice");
				break;
			}
		}
		while (options);
}
}
