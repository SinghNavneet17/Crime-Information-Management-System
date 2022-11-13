package Usecases;

import java.util.Scanner;

import Bean.Crime_Info;
import DAO.CrimeDao;
import DAO.CrimeDaoImp;

public class AddCrimeUsecase {
	public static void AddCrimeRecord()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Crime Date in YYYY-MM-DD Format: ");
		String date1 = sc.nextLine();

		System.out.println("Enter Crime Place : ");
		String place = sc.nextLine();

		System.out.println("Enter crime Name : ");
		String crime = sc.nextLine();

		System.out.println("Enter Victims Name : ");
		String victim = sc.nextLine();

		System.out.println("Enter Detail Description of crime: ");
		String desc = sc.nextLine();

		System.out.println("Enter Crime Suspect's name : ");
		String suspect = sc.nextLine();

		CrimeDao dao1 = new CrimeDaoImp();

		Crime_Info crime1 = new Crime_Info();

		crime1.setCdate(date1);
		crime1.setCplace(place);
		crime1.setCrime_name(crime);
		crime1.setVictims(victim);
		
		crime1.setCrime_Description(desc);
		crime1.setSuspects(suspect);

		String result = dao1.AddCrime(crime1);

		System.out.println(result);

	}
}
