package Usecases;

import java.util.Scanner;

import Bean.Crime_Info;
import DAO.CrimeDao;
import DAO.CrimeDaoImp;

public class StatusUpdateUsecase {
	public static void UpdateCaseStatus()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Update Case Status to Resolved/Unresolved6: ");
		String Status = sc.next();

		System.out.println("Enter the crimId: ");
		int id = sc.nextInt();

		CrimeDao dao = new CrimeDaoImp();

		Crime_Info crime = new Crime_Info();

		crime.setStatus(Status);
		;
		crime.setCrimeId(id);
		;

		String result = dao.UpdateCrime(crime);

		System.out.println(result);
	}
}
